package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087403 a(n) = smallest prime of the form 10*K(n) + 1, where K is a number obtained by concatenation of n with itself, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A087403 extends Sequence1 {

  private long mN = 0;
  private long mMul = 10;

  @Override
  public Z next() {
    if (++mN == mMul) {
      mMul *= 10;
    }
    Z s = Z.ZERO;
    while (true) {
      s = s.multiply(mMul).add(mN);
      final Z t = s.multiply(10).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
