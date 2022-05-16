package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054799 Integers n such that sigma(n+2) = sigma(n) + 2, where sigma = A000203, the sum of divisors of n.
 * @author Sean A. Irvine
 */
public class A054799 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma().add(2).equals(Jaguar.factor(mN + 2).sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
