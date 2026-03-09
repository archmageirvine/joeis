package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005132;

/**
 * A393815 allocated for Benjamin Chaffin.
 * @author Sean A. Irvine
 */
public class A393815 extends Sequence1 {

  private final Sequence mRecaman = new A005132().skip();
  private Z mA = null;
  private long mN = 0;
  private long mLastMod = 0;

  @Override
  public Z next() {
    Z min = mA;
    long minIndex = mN;
    long prevMod = mLastMod;
    while (true) {
      ++mN;
      mA = mRecaman.next();
      final long mod = mN == 0 ? 0 : mA.mod(mN);
      if (mod > prevMod) {
        mLastMod = mod;
        return Z.valueOf(minIndex);
      }
      if (min == null || mA.compareTo(min) < 0) {
        min = mA;
        minIndex = mN;
      }
      prevMod = mod;
    }
  }
}

