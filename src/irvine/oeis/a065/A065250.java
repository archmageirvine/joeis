package irvine.oeis.a065;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A065250 Permutation of N induced by the order-preserving permutation of the positive rational numbers (x -&gt; 2x), positions in Stern-Brocot tree.
 * @author Sean A. Irvine
 */
public class A065250 extends A065249 {

  @Override
  public Z next() {
    if (mBreadthFirst.isEmpty()) {
      stepSternBrocot();
    }
    final Q t = mBreadthFirst.pollFirst().multiply(2);
    while (mOrdering.get(t) == null) {
      stepSternBrocot();
    }
    // We can remove because this is a permutation
    return Z.valueOf(mOrdering.remove(t));
  }
}
