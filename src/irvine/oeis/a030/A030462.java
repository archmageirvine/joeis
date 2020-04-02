package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A030462 Palindromic prime concatenated with next palindromic prime is a prime.
 * @author Sean A. Irvine
 */
public class A030462 extends A002385 {

  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mP;
      mP = super.next();
      if (new Z(t.toString() + mP).isProbablePrime()) {
        return t;
      }
    }
  }
}
