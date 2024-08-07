package irvine.oeis.a143;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A143993 Composite numbers n such that the sum of prime factors of n (counted with multiplicity) terminates n as a substring.
 * @author Sean A. Irvine
 */
public class A143993 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final long sopfr = Functions.SOPFR.l(c);
      long m = 10;
      while (m <= sopfr) {
        m *= 10;
      }
      if (c.mod(m) == sopfr) {
        return c;
      }
    }
  }
}
