package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A069152 a(n) = (n-1)!-n^tau(n)/n^2.
 * @author Sean A. Irvine
 */
public class A069152 extends Sequence2 {

  private Z mF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    mF = mF.multiply(mN++);
    return mF.subtract(Z.valueOf(mN).pow(Jaguar.factor(mN).sigma0AsLong() - 2));
  }
}

