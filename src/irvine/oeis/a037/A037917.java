package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A037917 Numbers n such that the Fibonacci number F(n) is divisible by a square.
 * @author Sean A. Irvine
 */
public class A037917 extends A000045 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Jaguar.factor(super.next()).maxExponent() > 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
