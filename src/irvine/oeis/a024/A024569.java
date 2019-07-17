package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024569 <code>[ 1/{n*r} ]</code>, where r <code>= (1 + sqrt(5))/2</code> and <code>{x} := x - [ x ]</code>.
 * @author Sean A. Irvine
 */
public class A024569 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR s = CR.valueOf(++mN).multiply(CR.PHI);
    return s.subtract(CR.valueOf(s.floor())).inverse().floor();
  }
}
