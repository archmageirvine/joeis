package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061400 Primes p such that there is no squarefree number between p and the next prime.
 * @author Sean A. Irvine
 */
public class A061400 extends A000040 {

  private boolean is(final Z p) {
    Z t = p.add(1);
    while (!t.isProbablePrime()) {
      if (Jaguar.factor(t).isSquareFree()) {
        return false;
      }
      t = t.add(1);
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}

