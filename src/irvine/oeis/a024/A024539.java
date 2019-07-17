package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024539 <code>a(n) = [ 1/{n*sqrt(2)} ]</code>, where <code>{x} := x - [ x ]</code>.
 * @author Sean A. Irvine
 */
public class A024539 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR s = CR.valueOf(++mN).multiply(CR.SQRT2);
    return s.subtract(CR.valueOf(s.floor())).inverse().floor();
  }
}
