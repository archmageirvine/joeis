package irvine.oeis.a005;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A005772 Number of permutations of length n with 2 cycle lengths.
 * @author Sean A. Irvine
 */
public class A005772 extends Sequence3 {

  // After Alois P. Heinz

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int i = 2; i < mN; ++i) {
      final Z fi = Functions.FACTORIAL.z(i - 1);
      Z fij = Z.ONE;
      for (int j = 1; i * j < mN; ++j) {
        fij = fij.multiply(fi);
        final int nij = mN - i * j;
        final Z fj = Functions.FACTORIAL.z(j);
        for (final Z dd : Jaguar.factor(nij).divisors()) {
          final int d = dd.intValueExact();
          if (d < i) {
            final int nijd = nij / d;
            final Z fdp = Functions.FACTORIAL.z(d - 1).pow(nijd);
            final int[] multinomialCoeffs = new int[j + nijd];
            Arrays.fill(multinomialCoeffs, 0, j, i);
            Arrays.fill(multinomialCoeffs, j, multinomialCoeffs.length, d);
            final Z m = Binomial.multinomial(mN, multinomialCoeffs);
            final Z t = fij.multiply(fdp).multiply(m).divide(fj).divide(Functions.FACTORIAL.z(nijd));
            sum = sum.add(t);
          }
        }
      }
    }
    return sum;
  }
}
