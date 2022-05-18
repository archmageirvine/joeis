package irvine.oeis.a035;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A035132 Nonsquarefree palindromes.
 * @author Sean A. Irvine
 */
public class A035132 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z palin = super.next();
      if (Jaguar.factor(palin).maxExponent() > 1) {
        return palin;
      }
    }
  }
}
