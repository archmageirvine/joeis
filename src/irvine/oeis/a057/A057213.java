package irvine.oeis.a057;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057213 Second term of continued fraction for exp(n).
 * @author Sean A. Irvine
 */
public class A057213 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR exp = CR.valueOf(++mN).exp();
    return exp.subtract(CR.valueOf(exp.floor())).inverse().floor();
  }
}
