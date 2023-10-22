package irvine.oeis.a002;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002647 Sextan primes: p = (x^6 + y^6)/(x^2 + y^2).
 * @author Sean A. Irvine
 */
public class A002647 extends Sequence1 {

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
      final Z x6 = mX4.multiply(x2);
      for (Z y = Z.ONE; y.compareTo(mX) <= 0; y = y.add(1)) {
        final Z n = x6.add(y.pow(6)).divide(x2.add(y.square()));
        if (n.compareTo(mLastResult) > 0 && n.isProbablePrime()) {
          mP.add(n);
        }
      }
    }
    mLastResult = mP.pollFirst();
    return mLastResult;
  }
}
