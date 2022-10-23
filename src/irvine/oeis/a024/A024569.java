package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024569 [ 1/{n*r} ], where r = (1 + sqrt(5))/2 and {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024569 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR s = CR.valueOf(++mN).multiply(CR.PHI);
    return s.subtract(CR.valueOf(s.floor())).inverse().floor();
  }
}
