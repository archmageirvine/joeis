package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024573 <code>a(n) = floor(1/frac(n*e))</code>.
 * @author Sean A. Irvine
 */
public class A024573 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR s = CR.valueOf(++mN).multiply(CR.E);
    return s.subtract(CR.valueOf(s.floor())).inverse().floor();
  }
}
