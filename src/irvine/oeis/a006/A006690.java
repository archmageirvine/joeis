package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A006690 Number of deterministic, completely-defined, initially-connected finite automata with 3 inputs and n unlabeled states.
 * @author Sean A. Irvine
 */
public class A006690 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      add(null);
      return Z.ONE;
    }
    final int n = size();
    final Z zn = Z.valueOf(n);
    Q sum = Q.ZERO;
    Z f = Z.ONE;
    for (int k = 1; k < n; ++k) {
      f = f.multiply(k);
      sum = sum.add(new Q(zn.pow(3L * k).multiply(a(n - k)), f));
    }
    return new Q(zn.pow(3L * n), f).subtract(sum).toZ();
  }
}
