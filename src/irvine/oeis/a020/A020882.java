package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020882 Ordered hypotenuses (with multiplicity) of primitive Pythagorean triangles.
 * @author Sean A. Irvine
 */
public class A020882 extends Sequence1 {

  private long mC = 4;
  private long mB = 4;

  @Override
  public Z next() {
    while (true) {
      if (++mB >= mC) {
        ++mC;
        mB = 1;
      }
      if (Functions.GCD.l(mC, mB) == 1) {
        final long a2 = mC * mC - mB * mB;
        final long a = Functions.SQRT.l(a2);
        if (a < mB && a * a == a2 && Functions.GCD.l(a, mC) == 1 && Functions.GCD.l(a, mB) == 1) {
          return Z.valueOf(mC);
        }
      }
    }
  }
}
