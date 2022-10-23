package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058072 Numbers k such that sigma(k) divides sigma(k+1), where sigma(k) is sum of positive divisors of k.
 * @author Sean A. Irvine
 */
public class A058072 extends Sequence1 {

  private long mN = 0;
  private Z mSigma = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z s = mSigma;
      mSigma = Jaguar.factor(++mN + 1).sigma();
      if (mSigma.mod(s).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

