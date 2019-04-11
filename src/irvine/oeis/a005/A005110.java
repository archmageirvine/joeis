package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A005110 Class <code>2-</code> primes (for definition see A005109).
 * @author Sean A. Irvine
 */
public class A005110 extends A000040 {

  private int primeClass(final Z n) {
    if (mFast.isPrime(n)) {
      int res = 1;
      for (final Z p : Cheetah.factor(n.subtract(1)).toZArray()) {
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
