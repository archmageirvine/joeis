package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000994;
import irvine.oeis.a000.A000995;

/**
 * A086880 a(n) = floor(Sum_{k=0..infinity} k^n/(k!)^2); related to generalized Bell numbers.
 * @author Sean A. Irvine
 */
public class A086880 extends Sequence0 {

  private static final CR B0 = CrFunctions.BESSEL_I0.cr(2);
  private static final CR B1 = CrFunctions.BESSEL_I.cr(1, CR.TWO);
  private final Sequence mA = new A000994();
  private final Sequence mB = new A000995();

  @Override
  public Z next() {
    return B0.multiply(mA.next()).add(B1.multiply(mB.next())).floor();
  }
}
