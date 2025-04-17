package irvine.oeis.a077;

import java.util.ArrayList;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077765 Number of maximum-size antichains in partition lattice Par(n).
 * @author Sean A. Irvine
 */
public class A077765 extends Sequence0 {

  private int mN = -1;
  private long mMax;
  private long mMaxCount;
  private final ArrayList<int[]> mPar = new ArrayList<>();
  private boolean[][] mComparable;

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
        mMaxCount = 1;
      } else {
        ++mMaxCount;
      }
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
    return Z.valueOf(mMaxCount);
  }
}
