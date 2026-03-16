package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005132;

/**
 * A393814 Minimum value taken by Recam\u00e1n's sequence (A005132) between terms where A005132(k) mod k increases.
 * @author Sean A. Irvine
 */
public class A393814 extends Sequence1 {

  private final Sequence mRecaman = new A005132().skip();
  private Z mA = null;
  private long mN = 0;
  private long mLastMod = 0;

  @Override
  public Z next() {
    Z min = mA;
    long prevMod = mLastMod;
    while (true) {
      ++mN;
      mA = mRecaman.next();
      final long mod = mN == 0 ? 0 : mA.mod(mN);
      if (mod > prevMod) {
        mLastMod = mod;
        return min;
      }
      if (min == null || mA.compareTo(min) < 0) {
        min = mA;
      }
      prevMod = mod;
    }
  }
}

