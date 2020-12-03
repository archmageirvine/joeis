package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031140 Position of rightmost 0 in 2^n increases.
 * @author Sean A. Irvine
 */
public class A031140 implements Sequence {

  private Z mMod = Z.TEN.pow(20);
  private Z mT = null;
  private long mN = -1;
  protected int mPrevBest = 0;

  protected int positionRightMostZero(Z n) {
    int pos = 0;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (qr[1].isZero()) {
        return pos;
      }
      n = qr[0];
      ++pos;
    }
    return -1; // no zero found
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      // Use the following alternative if you are worried about the heuristic
      // mT = mT == null ? Z.ONE : mT.multiply2();
      mT = mT == null ? Z.ONE : mT.multiply2().mod(mMod);
      final int z = positionRightMostZero(mT);
      if (z > mPrevBest) {
        mPrevBest = z;
        mMod = Z.TEN.pow(10 * (mPrevBest + 1)); // head room heuristic
        return Z.valueOf(mN);
      }
    }
  }
}

