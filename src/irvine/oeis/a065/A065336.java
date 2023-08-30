package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065336 a(0) = 1; thereafter, a(n) is the smallest number such that Sum_{m = 0 .. n-1} a(m)*a(m+1) is a square.
 * @author Sean A. Irvine
 */
public class A065336 extends Sequence0 {

  private Z mA = null;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    } else {
      long k = 0;
      while (true) {
        final Z s = mSum.add(mA.multiply(++k));
        if (s.isSquare()) {
          mSum = s;
          mA = Z.valueOf(k);
          return mA;
        }
      }
    }
  }
}
