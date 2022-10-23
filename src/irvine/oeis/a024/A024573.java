package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024573 a(n) = floor(1/frac(n*e)).
 * @author Sean A. Irvine
 */
public class A024573 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR s = CR.valueOf(++mN).multiply(CR.E);
    return s.subtract(CR.valueOf(s.floor())).inverse().floor();
  }
}
