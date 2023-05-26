package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063917.
 * @author Sean A. Irvine
 */
public class A063919 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : Jaguar.factor(mN).unitarySigma().subtract(mN);
  }
}
