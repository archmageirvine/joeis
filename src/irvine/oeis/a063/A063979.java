package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A063979 Number of decimal digits in (n!)!; A000197.
 * @author Sean A. Irvine
 */
public class A063979 extends A000142 {

  @Override
  public Z next() {
    final CR z = CR.valueOf(super.next());
    final CR c1 = z.log().multiply(z).subtract(z).add(z.multiply(CR.TAU).log().multiply(CR.HALF).add(z.multiply(12).inverse()));
    return c1.divide(CR.LOG10).floor().add(1);
  }
}

