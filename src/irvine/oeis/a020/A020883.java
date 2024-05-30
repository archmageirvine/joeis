package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020883 Ordered long legs of primitive Pythagorean triangles.
 * @author Sean A. Irvine
 */
public class A020883 extends Sequence1 {

  private long mA = 2;
  private long mB = 4;

  @Override
  public Z next() {
    while (true) {
      if (++mA >= mB) {
        ++mB;
        mA = 1;
      }
      if (Functions.GCD.l(mA, mB) == 1) {
        final long c2 = mA * mA + mB * mB;
        final long s = Functions.SQRT.l(c2);
        if (s * s == c2 && Functions.GCD.l(s, mA) == 1 && Functions.GCD.l(s, mB) == 1) {
          return Z.valueOf(mB);
        }
      }
    }
  }
}
