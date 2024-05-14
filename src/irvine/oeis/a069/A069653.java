package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A069653 Smallest n-digit number with only prime divisors 2 or 3 (i.e., of the form 2^a * 3^b).
 * @author Sean A. Irvine
 */
public class A069653 extends A003586 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.compareTo(mN) >= 0) {
        mN = mN.multiply(10);
        return t;
      }
    }
  }
}

