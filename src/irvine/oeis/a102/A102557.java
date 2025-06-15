package irvine.oeis.a102;
// manually 2025-06-13/conum at 2025-06-13 15:33

import irvine.math.z.Z;

/**
 * A102557 Denominator of the probability that 2n-dimensional Gaussian random triangle has an obtuse angle.
 * Numerator is A102556
 * @author Georg Fischer
 */
public class A102557 extends A102556 {

  @Override
  public Z next() {
    return super.nextQ().den();
  }
}
