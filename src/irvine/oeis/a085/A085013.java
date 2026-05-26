package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085013 a(1) = 1; for n&gt;1, a(n) = smallest prime &gt; a(n-1) such that a(1)*...*a(n) + 2 is a prime.
 * @author Sean A. Irvine
 */
public class A085013 extends Sequence1 {

  private Z mA = null;
  private Z mProd = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    while (true) {
      mA = Functions.NEXT_PRIME.z(mA);
      final Z t = mProd.multiply(mA);
      if (t.add(2).isProbablePrime()) {
        mProd = t;
        return mA;
      }
    }
  }
}
