package irvine.oeis.a063;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063011 Ordered products of the sides of primitive Pythagorean triangles.
 * @author Sean A. Irvine
 */
public class A063011 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mC = 4;
  private long mB = 4;

  @Override
  public Z next() {
    while (mA.isEmpty() || Z.valueOf(mC).square().compareTo(mA.first()) <= 0) {
      if (++mB >= mC) {
        ++mC;
        mB = 1;
      }
      if (Functions.GCD.l(mC, mB) == 1) {
        final long a2 = mC * mC - mB * mB;
        final long a = Functions.SQRT.l(a2);
        if (a < mB && a * a == a2 && Functions.GCD.l(a, mC) == 1 && Functions.GCD.l(a, mB) == 1) {
          mA.add(Z.valueOf(mC).multiply(mB).multiply(a));
        }
      }
    }
    return mA.pollFirst();
  }
}
