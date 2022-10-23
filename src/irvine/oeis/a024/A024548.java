package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024548 [ 1/{n*sqrt(3)} ], where {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024548 extends Sequence1 {

  private static final CR SQRT3 = CR.THREE.sqrt();
  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    final CR s = n.multiply(SQRT3);
    return s.subtract(CR.valueOf(s.floor())).inverse().floor();
  }
}
