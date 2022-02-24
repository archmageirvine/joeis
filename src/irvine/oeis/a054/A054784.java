package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054784 Integers n such that sigma(2n) - sigma(n) is a power of 2, where sigma is the sum of the divisors of n.
 * @author Sean A. Irvine
 */
public class A054784 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(2 * ++mN).sigma().subtract(Cheetah.factor(mN).sigma()).bitCount() == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
