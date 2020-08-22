package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import java.util.TreeSet;
import java.util.HashSet;

/**
 * A002649 Quintan primes: p = (x^5 - y^5 )/(x - y).
 * @author Sean A. Irvine
 */
public class A002649 implements Sequence {

  private final HashSet<Z> mSeen = new HashSet<>();
  private final TreeSet<Z> mP = new TreeSet<>();
  {
    mP.add(Z.FIVE);
  }
  private Z mX = Z.ZERO;
  private Z mX4 = Z.ZERO;
  private Z mLastResult = Z.ZERO;

  @Override
  public Z next() {
    while (mP.isEmpty() || mP.first().compareTo(mX4) > 0) {
      mX = mX.add(1);
      final Z x2 = mX.square();
      mX4 = x2.square();
      final Z x5 = mX4.multiply(mX);
      for (Z y = Z.ONE; y.compareTo(mX) < 0; y = y.add(1)) {
        final Z n = x5.subtract(y.pow(5)).divide(mX.subtract(y));
        if (n.isProbablePrime()) {
          if (n.compareTo(mLastResult) > 0) {
            mP.add(n);
          } else if (!mSeen.contains(n)) {
            throw new UnsupportedOperationException("Out of sequence: " + n);
          }
        }
      }
    }
    mLastResult = mP.pollFirst();
    mSeen.add(mLastResult);
    return mLastResult;
  }
}
