package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085067 a(1) = 6, a(n) = smallest number of the form k*a(n-1) + 1 with the same number of divisors, i.e., 4.
 * @author Sean A. Irvine
 */
public class A085067 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.SIX;
    } else {
      long k = 0;
      while (true) {
        final Z t = mA.multiply(++k).add(1);
        if (Functions.SIGMA0.l(t) == 4) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}
