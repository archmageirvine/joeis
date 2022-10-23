package irvine.oeis.a057;

import java.util.LinkedList;
import java.util.TreeMap;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057114 Permutation of N induced by the order-preserving permutation of the rational numbers (x -&gt; x+1); positions in Stern-Brocot tree.
 * @author Sean A. Irvine
 */
public class A057114 extends Sequence1 {

  // Full (-infinity,infinity) Stern-Brocot tree
  private final LinkedList<Q> mBreadthFirst = new LinkedList<>();
  private final TreeMap<Q, Long> mOrdering = new TreeMap<>();
  private long mOrderingIndex = 0;
  private Z[] mFullNum = {Z.NEG_ONE, Z.ZERO, Z.ONE};
  private Z[] mFullDen = {Z.ZERO, Z.ONE, Z.ZERO};
  {
    mBreadthFirst.add(Q.ZERO);
    mOrdering.put(Q.ZERO, ++mOrderingIndex);
  }

  private void stepSternBrocot() {
    // Compute entire next row of the tree
    final int len1 = 2 * mFullNum.length - 1;
    final Z[] fullNum = new Z[len1];
    final Z[] fullDen = new Z[len1];
    fullNum[0] = mFullNum[0];
    fullDen[0] = mFullDen[0];
    for (int k = 0, j = 1; k < mFullNum.length - 1; ++k) {
      final Z n = mFullNum[k + 1];
      final Z d = mFullDen[k + 1];
      fullNum[j] = mFullNum[k].add(n);
      fullDen[j] = mFullDen[k].add(d);
      final Q t = new Q(fullNum[j], fullDen[j]);
      mBreadthFirst.add(t);
      mOrdering.put(t, ++mOrderingIndex);
      ++j;
      fullNum[j] = n;
      fullDen[j] = d;
      ++j;
    }
    mFullNum = fullNum;
    mFullDen = fullDen;
  }

  @Override
  public Z next() {
    final Q t = mBreadthFirst.pollFirst().add(1);
    while (mOrdering.get(t) == null) {
      stepSternBrocot();
    }
    // We can remove because this is a permutation
    return Z.valueOf(mOrdering.remove(t));
  }
}
