package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A055719 d(n)-1 | n and n is not prime.
 * @author Sean A. Irvine
 */
public class A055719 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.mod(Jaguar.factor(n).sigma0().subtract(1)).isZero()) {
        return n;
      }
    }
  }
}
