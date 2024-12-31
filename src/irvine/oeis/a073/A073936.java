package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a092.A092559;

/**
 * A073936 Numbers k such that 2^k + 1 is the product of two distinct primes.
 * @author Sean A. Irvine
 */
public class A073936 extends A092559 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Functions.OMEGA.i(Z.ONE.shiftLeft(t.longValueExact()).add(1)) == 2) {
        return t;
      }
    }
  }
}

