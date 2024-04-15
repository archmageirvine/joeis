package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057265 Even refactorable numbers (i.e., the number of divisors is itself a divisor and it is also even).
 * @author Sean A. Irvine
 */
public class A057265 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final Z sigma0 = Functions.SIGMA0.z(mN);
      if (sigma0.isEven() && mN.mod(sigma0).isZero()) {
        return mN;
      }
    }
  }
}
