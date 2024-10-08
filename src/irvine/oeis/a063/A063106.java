package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a003.A003422;

/**
 * A063106 Primes of form !n + 2n - 1.
 * @author Sean A. Irvine
 */
public class A063106 extends A003422 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().add(2L * mN + 1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
