package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390353 Integrals of stable envelopes of fixed points in T^*Gr(2,n).
 * @author Sean A. Irvine
 */
public class A390353 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ONE;
    }
    long bigN = 1;
    while (Binomial.binomial(bigN + 1, 3).compareTo(mN) < 0) {
      ++bigN;
    }
    final long d = Z.valueOf(mN).subtract(Binomial.binomial(bigN, 3)).longValueExact();
    for (long i1 = 1; i1 < bigN; ++i1) {
      for (long i2 = i1 + 1; i2 <= bigN; ++i2) {
        if (bigN * (i1 - 1) - i1 * (i1 - 1) / 2 + (i2 - i1) == d) {
          return Functions.FACTORIAL.z(bigN - 3)
            .multiply(Functions.FACTORIAL.z(bigN - 2))
            .multiply(i2 + i1 * i1 * (bigN - 1) + i2 * i2 * (bigN - 1) + 2 * bigN + i2 * (bigN - 4) * bigN + i1 * (-3 - 2 * i2 * (bigN - 2) - (bigN - 2) * bigN))
            .divide(Functions.FACTORIAL.z(i1 - 1).multiply(Functions.FACTORIAL.z(i2 - 1)).multiply(Functions.FACTORIAL.z(bigN - i1)).multiply(Functions.FACTORIAL.z(bigN - i2)));
        }
      }
    }
    throw new RuntimeException();
  }
}

