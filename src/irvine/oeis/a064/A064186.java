package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A064186 Numbers n such that n!+1 and n!-1 have the same number of prime divisors (with repetition).
 * @author Sean A. Irvine
 */
public class A064186 extends A000142 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (Jaguar.factor(f.add(1)).bigOmega() == Jaguar.factor(f.subtract(1)).bigOmega()) {
        return Z.valueOf(mN);
      }
    }
  }
}
