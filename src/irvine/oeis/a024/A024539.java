package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024539 a(n) = [ 1/{n*sqrt(2)} ], where {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024539 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR s = CR.valueOf(++mN).multiply(CR.SQRT2);
    return s.subtract(CR.valueOf(s.floor())).inverse().floor();
  }
}
