package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029519 Numbers k such that k divides the (left) concatenation of all numbers &lt;= k written in base 2 (most significant digit on right and removing all least significant zeros before concatenation).
 * @author Sean A. Irvine
 */
public class A029519 extends Sequence1 {

  private long mN = 0;
  private Z mSum = Z.ZERO;
  private int mShift = 0;

  @Override
  public Z next() {
    while (true) {
      long n = ++mN;
      while ((n & 1) == 0) {
        n >>= 1;
      }
      long v = 0;
      int c = 0;
      do {
        v <<= 1;
        v |= n & 1;
        n >>= 1;
        ++c;
      } while (n != 0);
      mSum = mSum.add(Z.valueOf(v).shiftLeft(mShift));
      mShift += c;
      if ((mN & 1) != 0 && mSum.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

