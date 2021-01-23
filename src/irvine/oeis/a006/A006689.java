package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006689 Number of deterministic, completely-defined, initially-connected finite automata with 2 inputs and n unlabeled states.
 * @author Sean A. Irvine
 */
public class A006689 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      add(null);
      return Z.ONE;
    }
    final int n = size();
    final Z zn = Z.valueOf(n);
    Q sum = Q.ZERO;
    Z f = Z.ONE;
    for (int k = 1; k < n; ++k) {
      f = f.multiply(k);
      sum = sum.add(new Q(zn.pow(2 * k).multiply(get(n - k)), f));
    }
    return new Q(zn.pow(2 * n), f).subtract(sum).toZ();
  }
}
