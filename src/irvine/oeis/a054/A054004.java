package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002961;

/**
 * A054004 Numbers n such that n and n+1 have the same number and sum of divisors.
 * @author Sean A. Irvine
 */
public class A054004 extends A002961 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (Jaguar.factor(n).sigma0().equals(Jaguar.factor(n.add(1)).sigma0())) {
        return n;
      }
    }
  }
}
