package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024564 <code>a(n) = [ 1/{n*sqrt(7)} ]</code>, where <code>{x} := x - [ x ]</code>.
 * @author Sean A. Irvine
 */
public class A024564 implements Sequence {

  private static final CR SQRT7 = CR.valueOf(7).sqrt();
  private long mN = 0;

  @Override
  public Z next() {
    final CR s = CR.valueOf(++mN).multiply(SQRT7);
    return s.subtract(CR.valueOf(s.floor())).inverse().floor();
  }
}
