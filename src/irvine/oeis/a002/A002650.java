package irvine.oeis.a002;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002650 Quintan primes: p = (x^5 + y^5)/(x + y).
 * @author Sean A. Irvine
 */
public class A002650 implements Sequence {

  private final TreeSet<Z> mP = new TreeSet<>();
  private Z mX = Z.ZERO;
  private Z mX4 = Z.ZERO;
  private Z mLastResult = Z.ZERO;

  @Override
  public Z next() {
    while (mP.isEmpty() || mP.first().compareTo(mX4.divide2()) > 0) {
      mX = mX.add(1);
      final Z x2 = mX.square();
      mX4 = x2.square();
      final Z x5 = mX4.multiply(mX);
      for (Z y = Z.ONE; y.compareTo(mX) <= 0; y = y.add(1)) {
        final Z n = x5.add(y.pow(5)).divide(mX.add(y));
        if (n.compareTo(mLastResult) > 0 && n.isProbablePrime()) {
          mP.add(n);
        }
      }
    }
    mLastResult = mP.pollFirst();
    return mLastResult;
  }
}
