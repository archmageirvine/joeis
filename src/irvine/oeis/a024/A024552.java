package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024552 a(n) = [ n/{n*sqrt(5)} ], where {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024552 extends Sequence1 {

  private static final CR SQRT5 = CR.FIVE.sqrt();
  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR s = n.multiply(SQRT5);
    return n.divide(s.subtract(CR.valueOf(s.floor()))).floor();
  }
}
