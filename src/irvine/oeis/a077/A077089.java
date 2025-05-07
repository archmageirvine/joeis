package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077089 Quotients when sigma(k+1)/sigma(k) is an integer.
 * @author Sean A. Irvine
 */
public class A077089 extends Sequence1 {

  private long mN = 0;
  private Z mSigma = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z s = mSigma;
      mSigma = Functions.SIGMA1.z(++mN + 1);
      final Z[] qr = mSigma.divideAndRemainder(s);
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

