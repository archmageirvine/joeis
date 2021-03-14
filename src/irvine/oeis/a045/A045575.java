package irvine.oeis.a045;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045575.
 * @author Sean A. Irvine
 */
public class A045575 implements Sequence {

  // After Robert Israel

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
    mA.add(Z.ONE);
  }
  private Z mPrev = Z.ONE;
  private Z mLim = Z.ONE.shiftLeft(10);

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      for (int x = 2; Z.valueOf(x).pow(x + 1).subtract(Z.valueOf(x + 1).pow(x)).compareTo(mLim) <= 0; ++x) {
        int y = x;
        while (true) {
          ++y;
          final Z z = Z.valueOf(x).pow(y).subtract(Z.valueOf(y).pow(x));
          if (z.compareTo(mLim) > 0) {
            break;
          }
          if (z.compareTo(mPrev) > 0) {
            mA.add(z);
          }
        }
      }
      mPrev = mA.last();
      mLim = mLim.multiply2();
    }
    return mA.pollFirst();
  }
}
