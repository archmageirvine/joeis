package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020884 Ordered short legs of primitive Pythagorean triangles.
 * @author Sean A. Irvine
 */
public class A020884 extends Sequence1 {

  private long mA = 2;
  private long mB = 3;

  @Override
  public Z next() {
    while (true) {
      mB += 2;
      if (mB > mA * mA / 2) {
        ++mA;
        mB = mA + 1;
      }
      if (Functions.GCD.l(mA, mB) == 1) {
        final long c2 = mA * mA + mB * mB;
        final long c = Functions.SQRT.l(c2);
        if (c * c == c2 && Functions.GCD.l(c, mA) == 1 && Functions.GCD.l(c, mB) == 1) {
          return Z.valueOf(mA);
        }
      }
    }
  }
}
