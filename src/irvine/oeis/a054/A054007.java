package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002961;

/**
 * A054007 Numbers k such that k and k+1 have the same sum but an unequal number of divisors.
 * @author Sean A. Irvine
 */
public class A054007 extends A002961 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (!Jaguar.factor(n).sigma0().equals(Jaguar.factor(n.add(1)).sigma0())) {
        return n;
      }
    }
  }
}
