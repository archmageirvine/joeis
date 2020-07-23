package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033950 Refactorable numbers: number of divisors of n divides <code>n</code>. Also known as tau numbers.
 * @author Sean A. Irvine
 */
public class A033950 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.ZERO.equals(mN.mod(Cheetah.factor(mN).sigma0()))) {
        return mN;
      }
    }
  }
}
