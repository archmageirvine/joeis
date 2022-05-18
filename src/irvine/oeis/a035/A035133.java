package irvine.oeis.a035;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A035133 Cubeful (i.e., not cubefree) palindromes.
 * @author Sean A. Irvine
 */
public class A035133 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z palin = super.next();
      if (Jaguar.factor(palin).maxExponent() > 2) {
        return palin;
      }
    }
  }
}
