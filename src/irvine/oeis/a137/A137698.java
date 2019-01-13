package irvine.oeis.a137;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashSet;

/**
 * A137698.
 * @author Sean A. Irvine
 */
public class A137698 implements Sequence {

  private Z mPrev = null;
  protected Z mLastK = null;
  private final HashSet<Z> mA137699 = new HashSet<>();

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Z.TWO;
    } else {
      do {
        mPrev = mPrev.add(1);
      } while (mA137699.contains(mPrev));
    }
    Z k = mPrev;
    do {
      k = k.add(1);
    } while (Z.ONE.equals(mPrev.gcd(k)));
    mA137699.add(k);
    mLastK = k;
    return mPrev;
  }
}

