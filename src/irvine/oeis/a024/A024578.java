package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024578 a(n) = [ 1/{n/e} ], {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024578 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR s = CR.valueOf(++mN).divide(CR.E);
    return s.subtract(CR.valueOf(s.floor())).inverse().floor();
  }
}
