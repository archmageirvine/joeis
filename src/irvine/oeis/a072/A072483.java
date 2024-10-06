package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072483 Triangle read by rows: The n-th row contains the smallest n increasing numbers larger than the last term of the previous row, which contain the string of digits of n.
 * @author Sean A. Irvine
 */
public class A072483 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mR = 0;
  private long mMod = 10;

  @Override
  public Z next() {
    if (++mM >= mN) {
      if (++mN == mMod) {
        mMod *= 10;
      }
      mM = 0;
    }
    while (true) {
      long v = ++mR;
      while (v >= mN) {
        if (v % mMod == mN) {
          return Z.valueOf(mR);
        }
        v /= 10;
      }
    }
  }
}

