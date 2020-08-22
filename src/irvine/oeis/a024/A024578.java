package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024578 a(n) = [ 1/{n/e} ], {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024578 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR s = CR.valueOf(++mN).divide(CR.E);
    return s.subtract(CR.valueOf(s.floor())).inverse().floor();
  }
}
