package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a003.A003266;

/**
 * A053413 Primes of the form  A003266(n) + 1.
 * @author Sean A. Irvine
 */
public class A053413 extends A003266 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
