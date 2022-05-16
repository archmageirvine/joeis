package irvine.oeis.a039;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A039833 Smallest of three consecutive squarefree numbers k, k+1, k+2 of the form p*q where p and q are primes.
 * @author Sean A. Irvine
 */
public class A039833 extends A039832 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Z.FOUR.equals(Jaguar.factor(t.add(2)).sigma0())) {
        return t;
      }
    }
  }
}
