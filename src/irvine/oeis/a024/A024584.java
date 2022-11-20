package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024584 a(n) = floor(1/frac(n*Pi)).
 * @author Sean A. Irvine
 */
public class A024584 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR s = CR.valueOf(++mN).multiply(CR.PI);
    return s.subtract(CR.valueOf(s.floor())).inverse().floor();
  }
}
