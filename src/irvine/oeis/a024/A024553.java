package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024553 [ 1/{n*sqrt(5)} ], where {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024553 extends Sequence1 {

  private static final CR SQRT5 = CR.FIVE.sqrt();
  private long mN = 0;

  @Override
  public Z next() {
    final CR s = CR.valueOf(++mN).multiply(SQRT5);
    return s.subtract(CR.valueOf(s.floor())).inverse().floor();
  }
}
