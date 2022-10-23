package irvine.oeis.a056;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A056901 Least semiperimeter s of primitive Pythagorean triangle with inradius n.
 * @author Sean A. Irvine
 */
public class A056901 extends Sequence1 {

  private final LongDynamicLongArray mSemiperimeter = new LongDynamicLongArray();
  private long mC = 4;
  private long mB = 4;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mSemiperimeter.get(mN) == 0) {
      if (++mB >= mC) {
        ++mC;
        mB = 1;
      }
      if (LongUtils.gcd(mC, mB) == 1) {
        final long a2 = mC * mC - mB * mB;
        final long a = LongUtils.sqrt(a2);
        if (a < mB && a * a == a2 && LongUtils.gcd(a, mC) == 1 && LongUtils.gcd(a, mB) == 1) {
          final long inradius = (a + mB - mC) / 2;
          final long sp = (a + mB + mC) / 2;
          final long existing = mSemiperimeter.get(inradius);
          if (existing == 0 || sp < existing) {
            mSemiperimeter.set(inradius, sp);
          }
        }
      }
    }
    return Z.valueOf(mSemiperimeter.get(mN));
  }
}
