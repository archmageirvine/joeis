package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import java.util.TreeSet;

/**
 * A002645.
 * @author Sean A. Irvine
 */
public class A002645 implements Sequence {

  private final TreeSet<Z> mP = new TreeSet<>();
  {
    mP.add(Z.TWO);
  }
  private Z mX = Z.ZERO;
  private Z mX4 = Z.ZERO;
  private Z mLastResult = Z.ZERO;

  @Override
  public Z next() {
    while (mP.isEmpty() || mP.first().compareTo(mX4) > 0) {
      mX = mX.add(1);
      mX4 = mX.pow(4);
      for (Z y = mX.isEven() ? Z.ONE : Z.TWO; y.compareTo(mX) <= 0; y = y.add(2)) {
        final Z n = mX4.add(y.pow(4));
        if (n.compareTo(mLastResult) > 0 && n.isProbablePrime()) {
          mP.add(n);
        }
      }
    }
    mLastResult = mP.pollFirst();
    return mLastResult;
  }
}
