package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075544 Primes which are the sum of the digital root of the first n primes for some n.
 * @author Sean A. Irvine
 */
public class A075544 extends A000040 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      mSum = mSum.add(Functions.DIGIT_SUM_ROOT.z(p));
      if (mSum.isProbablePrime()) {
        return mSum;
      }
    }
  }
}

