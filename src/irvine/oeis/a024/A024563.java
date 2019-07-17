package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024563 <code>a(n) = [ n/{n*sqrt(7)} ]</code>, where <code>{x} := x - [ x ]</code>.
 * @author Sean A. Irvine
 */
public class A024563 implements Sequence {

  private static final CR SQRT7 = CR.valueOf(7).sqrt();
  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR s = n.multiply(SQRT7);
    return n.divide(s.subtract(CR.valueOf(s.floor()))).floor();
  }
}
