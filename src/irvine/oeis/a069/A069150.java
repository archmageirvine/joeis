package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069150 Integers of the form k*k!/A062758(k) in the order they appear in A069149, where A062758(k) is the product of squares of divisors of k.
 * @author Sean A. Irvine
 */
public class A069150 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      final Z[] qr = mF.multiply(mN).divideAndRemainder(Z.valueOf(mN).pow(Jaguar.factor(mN).sigma0AsLong()));
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

