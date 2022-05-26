package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020882 Ordered hypotenuses (with multiplicity) of primitive Pythagorean triangles.
 * @author Sean A. Irvine
 */
public class A020882 implements Sequence {

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
        final long a = LongUtils.sqrt(a2);
        if (a < mB && a * a == a2 && LongUtils.gcd(a, mC) == 1 && LongUtils.gcd(a, mB) == 1) {
          return Z.valueOf(mC);
        }
      }
    }
  }
}
