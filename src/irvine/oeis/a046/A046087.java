package irvine.oeis.a046;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046087 Middle member 'b' of the primitive Pythagorean triples <code>(a,b,c)</code> ordered by increasing c, then b.
 * @author Sean A. Irvine
 */
public class A046087 implements Sequence {

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
          return Z.valueOf(mB);
        }
      }
    }
  }
}
