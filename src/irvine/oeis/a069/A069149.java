package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069149 Numbers k such that k*k!/A062758(k) is an integer where A062758(k) is the product of squares of divisors of k.
 * @author Sean A. Irvine
 */
public class A069149 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      if (mF.multiply(mN).mod(Z.valueOf(mN).pow(Jaguar.factor(mN).sigma0AsLong())).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

