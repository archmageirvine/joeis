package irvine.oeis.a035;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A035134 Squarefree composite palindromes.
 * @author Sean A. Irvine
 */
public class A035134 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z palin = super.next();
      if (!palin.isProbablePrime() && Jaguar.factor(palin).maxExponent() == 1) {
        return palin;
      }
    }
  }
}
