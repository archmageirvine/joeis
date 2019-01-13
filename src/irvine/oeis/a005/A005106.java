package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A005106.
 * @author Sean A. Irvine
 */
public class A005106 extends A000040 {

  protected int primeClass(final Z n) {
    if (mFast.isPrime(n)) {
      int res = 1;
      for (final Z p : Cheetah.factor(n.add(1)).toZArray()) {
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
