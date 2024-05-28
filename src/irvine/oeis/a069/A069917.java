package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069917 In base 6, the reversal of n equals the sum of the reversals of the proper divisors of n.
 * @author Sean A. Irvine
 */
public class A069917 extends Sequence1 {

  private long mN = 27;

  @Override
  public Z next() {
    while (true) {
      final long rev = Functions.REVERSE.l(6, ++mN);
      long sum = 0;
      for (final Z d : Jaguar.factor(mN).divisors()) {
        sum += Functions.REVERSE.l(6, d);
      }
      if (sum == 2 * rev) {
        return Z.valueOf(mN);
      }
    }
  }
}
