package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A007439 Number of planted trees: all sub-rooted trees from any node are identical; non-root, non-leaf nodes an even distance from the root are of degree 2.
 * @author Sean A. Irvine
 */
public class A007439 extends MemorySequence {

  {
    setOffset(1);
    add(null);
  }

  @Override
  public Z computeNext() {
    final int n = size();
    if (n < 3) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n - 2).divisors()) {
      sum = sum.add(a(d.intValue()));
    }
    return sum;
  }
}
