package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050242 [ (phi + sqrt(phi))^n ], phi = (1+sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A050242 extends Sequence0 {

  private static final CR C = CR.PHI.add(CR.PHI.sqrt());
  private long mN = -1;

  @Override
  public Z next() {
    return C.pow(++mN).floor();
  }
}
