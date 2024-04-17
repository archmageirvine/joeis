package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048133 Least number which becomes prime or 4 after exactly n iterations of f(x) = sum of prime factors of x.
 * @author Sean A. Irvine
 */
public class A048133 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    Z m = Z.FIVE;
    while (true) {
      m = m.add(1);
      Z t = m;
      for (int k = mN - 1; k >= 0; --k) {
        t = Functions.SOPFR.z(t);
        if (Z.FOUR.equals(t) || t.isProbablePrime()) {
          if (k == 0) {
            return m;
          } else {
            break;
          }
        }
      }
    }
  }
}
