package irvine.oeis.a065;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065337 a(n) is the smallest number not already used such that Sum_{m = 0 .. n-1} a(m)*a(m+1) is a square.
 * @author Sean A. Irvine
 */
public class A065337 extends Sequence0 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = null;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    } else {
      long k = 1;
      while (true) {
        if (!mUsed.contains(++k)) {
          final Z s = mSum.add(mA.multiply(k));
          if (s.isSquare()) {
            mSum = s;
            mA = Z.valueOf(k);
            mUsed.add(k);
            return mA;
          }
        }
      }
    }
  }
}
