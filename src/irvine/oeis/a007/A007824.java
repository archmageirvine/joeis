package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007824 <code>a(n) =</code> f(a(n-1)), with f(m) = Sum <code>i*b(i)*2^(i-1),</code> m = Sum <code>b(i)*2^i,</code> and starting value 16.
 * @author Sean A. Irvine
 */
public class A007824 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(16);
    } else {
      final Z t = mA;
      mA = Z.ZERO;
      for (int k = 0; k < t.bitLength(); ++k) {
        if (t.testBit(k)) {
          mA = mA.add(Z.valueOf(k).shiftLeft(k - 1));
        }
      }
    }
    return mA;
  }
}
