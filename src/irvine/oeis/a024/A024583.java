package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024583 a(n) = floor(n/{n*Pi}), where { } = fractional part.
 * @author Sean A. Irvine
 */
public class A024583 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR s = n.multiply(CR.PI);
    return n.divide(s.subtract(CR.valueOf(s.floor()))).floor();
  }
}
