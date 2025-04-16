package irvine.oeis.a076;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076779 Maximum number of disjoint maximum-size antichains in partition lattice Par(n).
 * @author Sean A. Irvine
 */
public class A076779 extends Sequence0 {

  private int mN = -1;
  private long mMax;
  private final HashSet<List<Integer>> mSolutions = new HashSet<>();
  private final ArrayList<int[]> mPar = new ArrayList<>();
  private boolean[][] mComparable;

  private void addIfDisjoint(final List<Integer> members) {
    for (final List<Integer> lst : mSolutions) {
      for (final int m : members) {
        for (final int v : lst) {
          if (v == m) {
            return; // not disjoint
          }
          if (v > m) {
            break;
          }
        }
      }
    }
    mSolutions.add(new ArrayList<>(members));
  }

  private boolean isOk(final ArrayList<Integer> members, final int p) {
    for (final int q : members) {
      if (mComparable[q][p]) {
        return false;
      }
    }
    return true;
  }

  private void search(final int pos, final ArrayList<Integer> members) {
    if (members.size() >= mMax) {
      if (members.size() > mMax) {
        mMax = members.size();
        mSolutions.clear();
      }
      addIfDisjoint(members);
    }
    for (int k = pos; k < mPar.size(); ++k) {
      if (isOk(members, k)) {
        members.add(k);
        search(k + 1, members);
        members.remove(members.size() - 1);
      }
    }
  }

  @Override
  public Z next() {
    mPar.clear();
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    while ((p = part.next()) != null) {
      mPar.add(p);
    }
    mComparable = new boolean[mPar.size()][mPar.size()];
    for (int k = 0; k < mPar.size(); ++k) {
      final int[] pk = mPar.get(k);
      for (int j = 0; j < k; ++j) {
        final int[] pj = mPar.get(j);
        final boolean c = IntegerPartition.ge(pk, pj) || IntegerPartition.ge(pj, pk);
        mComparable[k][j] = c;
        mComparable[j][k] = c;
      }
      mComparable[k][k] = true; // not really needed
    }
    mMax = 0;
    search(0, new ArrayList<>());
    return Z.valueOf(mSolutions.size());
  }
}
