package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038048 a(n) = (n-1)! * sigma(n).
 * @author Sean A. Irvine
 */
public class A038048 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    final Z res = Jaguar.factor(++mN).sigma().multiply(mF);
    mF = mF.multiply(mN);
    return res;
  }
}
