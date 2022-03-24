package irvine.oeis.a055;

import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A055488 Smallest number x such that sum of divisors of x is n!.
 * @author Sean A. Irvine
 */
public class A055488 extends A000142 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return InverseSigma.minInverseSigma(super.next(), 1);
  }
}
