package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007422 Multiplicatively perfect numbers j: product of divisors of j is j^2.
 * @author Sean A. Irvine
 */
public class A007422 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      Z prod = Z.ONE;
      for (final Z d : Jaguar.factor(++mN).divisors()) {
        prod = prod.multiply(d);
      }
      if (prod.equals(Z.valueOf(mN).square())) {
        return Z.valueOf(mN);
      }
    }
  }
}
