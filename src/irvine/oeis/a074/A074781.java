package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074781 Primes of the form p*2^k + 1 for any k and any prime p.
 * @author Sean A. Irvine
 */
public class A074781 extends A000040 {

  {
    super.next(); // skip 2
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p1 = p.subtract(1);
      final Z t = p1.divide(Functions.GPF.z(p1));
      if (t.makeOdd().isOne()) {
        return p;
      }
    }
  }
}
