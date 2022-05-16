package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A005110 Class 2- primes (for definition see A005109).
 * @author Sean A. Irvine
 */
public class A005110 extends A000040 {

  private int primeClass(final Z n) {
    if (mPrime.isPrime(n)) {
      int res = 1;
      for (final Z p : Jaguar.factor(n.subtract(1)).toZArray()) {
        if (p.compareTo(Z.THREE) > 0) {
          res = Math.max(res, primeClass(p) + 1);
        }
      }
      return res;
    } else {
      return -1;
    }
  }

  protected int primeClass() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (primeClass(p) == primeClass()) {
        return p;
      }
    }
  }
}
