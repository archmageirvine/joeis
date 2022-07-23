package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058073 Numbers k such that sigma(k+1) divides sigma(k), where sigma(k) is the sum of positive divisors of k.
 * @author Sean A. Irvine
 */
public class A058073 implements Sequence {

  private long mN = 0;
  private Z mSigma = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z s = mSigma;
      mSigma = Jaguar.factor(++mN + 1).sigma();
      if (s.mod(mSigma).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

