package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070948 a(0) = 1; a(n+1) = smallest number &gt; a(n) such that a(0)*a(1)*...*a(n) + 1 is a square.
 * @author Sean A. Irvine
 */
public class A070948 extends Sequence0 {

  // Possibly a continued fraction of mProd approach that is much faster?

  private Z mProd = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mProd == null) {
      mProd = Z.ONE;
      return Z.ONE;
    }
    while (true) {
      mA = mA.add(1);
      final Z t = mProd.multiply(mA);
      if (t.add(1).isSquare()) {
        mProd = t;
        return mA;
      }
    }
  }
}
