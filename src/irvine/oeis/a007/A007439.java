package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007439 Number of planted trees: all sub-rooted trees from <code>any</code> node are identical; non-root, non-leaf nodes an even distance from the root are of degree 2.
 * @author Sean A. Irvine
 */
public class A007439 extends MemorySequence {

  {
    add(null);
  }

  @Override
  public Z computeNext() {
    final int n = size();
    if (n < 3) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(n - 2).divisors()) {
      sum = sum.add(get(d.intValue()));
    }
    return sum;
  }
}
