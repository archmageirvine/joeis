package irvine.oeis.a057;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A057603 Second term of continued fraction for log(n).
 * @author Sean A. Irvine
 */
public class A057603 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final CR log = CR.valueOf(++mN).log();
    return log.subtract(CR.valueOf(log.floor())).inverse().floor();
  }
}
