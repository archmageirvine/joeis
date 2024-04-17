package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048124 Becomes prime or 4 after exactly 2 iterations of f(x) = sum of prime factors of x.
 * @author Sean A. Irvine
 */
public class A048124 extends Sequence1 {

  private Z mN = Z.ZERO;

  protected int iterations() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      Z t = mN;
      for (int k = iterations() - 1; k >= 0; --k) {
        t = Functions.SOPFR.z(t);
        if (Z.FOUR.equals(t) || t.isProbablePrime()) {
          if (k == 0) {
            return mN;
          } else {
            break;
          }
        }
      }
    }
  }
}
