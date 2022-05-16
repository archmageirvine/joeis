package irvine.oeis.a035;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A035135 Cubefree composite palindromes.
 * @author Sean A. Irvine
 */
public class A035135 extends A002113 {

  {
    super.next(); // skip 0
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Z palin = super.next();
      if (!palin.isProbablePrime() && Jaguar.factor(palin).maxExponent() <= 2) {
        return palin;
      }
    }
  }
}
