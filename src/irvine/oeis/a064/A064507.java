package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064507 Numbers of more than one digit that yield primes when cast in their own base.
 * @author Sean A. Irvine
 */
public class A064507 extends Sequence1 {

  private long mN = 20;

  @Override
  public Z next() {
    while (true) {
      if (Functions.GCD.l(++mN, 10) == 1) {
        Z t = Z.ZERO;
        long m = mN;
        Z v = Z.ONE;
        while (m != 0) {
          t = t.add(v.multiply(m % 10));
          m /= 10;
          v = v.multiply(mN);
        }
        if (t.isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
