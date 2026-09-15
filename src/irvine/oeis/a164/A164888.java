package irvine.oeis.a164;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A164888 Smallest positive integer for each n such that the sequences a(n), a(n)+n, and a(n)+2n have no repeated terms.
 * @author Sean A. Irvine
 */
public class A164888 extends Sequence1 {

  private long mN = 0;
  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  {
    mA.set(5); // assumed true (cf. A399623)
  }
  private long mLeastUnused = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      ++k;
      if (!mA.isSet(k) && !mA.isSet(k + mN) && !mA.isSet(k + 2 * mN)) {
        mA.set(k);
        mA.set(k + mN);
        mA.set(k + 2 * mN);
        return Z.valueOf(k);
      }
    }
  }
}
