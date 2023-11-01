package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A066652 Primes of the form 2*s - 1, where s is a squarefree number (A005117).
 * @author Sean A. Irvine
 */
public class A066652 extends A005117 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().multiply2().subtract(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
