package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033950 Refactorable numbers: number of divisors of k divides k. Also known as tau numbers.
 * @author Sean A. Irvine
 */
public class A057265 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final Z sigma0 = Jaguar.factor(mN).sigma0();
      if (sigma0.isEven() && mN.mod(sigma0).isZero()) {
        return mN;
      }
    }
  }
}
