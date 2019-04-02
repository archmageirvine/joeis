package irvine.oeis.a014;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014498 Varying radii of inscribed circles within primitive Pythagorean triples as a function of increasing values of hypotenuse.
 * @author Sean A. Irvine
 */
public class A014498 implements Sequence {

  private long mC = 4;
  private long mB = 4;

  @Override
  public Z next() {
    while (true) {
      if (++mB >= mC) {
        ++mC;
        mB = 1;
      }
      if (LongUtils.gcd(mC, mB) == 1) {
        final long a2 = mC * mC - mB * mB;
        final long s = LongUtils.sqrt(a2);
        if (s < mB && s * s == a2 && LongUtils.gcd(s, mC) == 1 && LongUtils.gcd(s, mB) == 1) {
          return Z.valueOf((s + mB - mC) / 2);
        }
      }
    }
  }
}
