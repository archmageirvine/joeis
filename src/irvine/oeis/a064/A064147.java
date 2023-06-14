package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A064147 Numbers k such that k! - 1 and k! + 1 have the same number of divisors, i.e., tau(k! - 1) = tau(k! + 1).
 * @author Sean A. Irvine
 */
public class A064147 extends A000142 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (Jaguar.factor(f.add(1)).sigma0().equals(Jaguar.factor(f.subtract(1)).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
