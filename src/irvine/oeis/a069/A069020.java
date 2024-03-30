package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069020 a(1) = 1; a(n) = smallest number of the form k*a(n-1) +1 divisible by n^2.
 * @author Sean A. Irvine
 */
public class A069020 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 19) {
      return null;
    }
    if (++mN > 1) {
      final long mod = mN * mN;
      Z t = mA.multiply2();
      while (t.add(1).mod(mod) != 0) {
        t = t.add(mA);
      }
      mA = t.add(1);
    }
    return mA;
  }
}

