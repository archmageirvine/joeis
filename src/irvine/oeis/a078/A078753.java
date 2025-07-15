package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078753 Number of steps to factor 2n+1 using Fermat's factorization method.
 * @author Sean A. Irvine
 */
public class A078753 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    for (final Z dd : Jaguar.factor(mN).divisorsSorted()) {
      final long d = dd.longValueExact();
      if (d * d >= mN) {
        return Z.valueOf((d + mN / d) / 2 - Functions.SQRT.l(mN - 1));
      }
    }
    throw new RuntimeException(); // impossible
  }
}
