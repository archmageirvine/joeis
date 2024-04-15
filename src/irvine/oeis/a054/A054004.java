package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002961;

/**
 * A054004 Numbers k such that k and k+1 have the same number and sum of divisors.
 * @author Sean A. Irvine
 */
public class A054004 extends A002961 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (Functions.SIGMA0.z(n).equals(Functions.SIGMA0.z(n.add(1)))) {
        return n;
      }
    }
  }
}
