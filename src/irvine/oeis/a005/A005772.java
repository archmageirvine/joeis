package irvine.oeis.a005;

import java.util.Arrays;

import irvine.factor.factor.Cheetah;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005772 Number of permutations of length n with 2 cycle lengths.
 * @author Sean A. Irvine
 */
public class A005772 implements Sequence {

  // After Alois P. Heinz

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int i = 2; i < mN; ++i) {
      final Z fi = mF.factorial(i - 1);
      Z fij = Z.ONE;
      for (int j = 1; i * j < mN; ++j) {
        fij = fij.multiply(fi);
        final int nij = mN - i * j;
        final Z fj = mF.factorial(j);
        for (final Z dd : Cheetah.factor(nij).divisors()) {
          final int d = dd.intValueExact();
          if (d < i) {
            final int nijd = nij / d;
            final Z fdp = mF.factorial(d - 1).pow(nijd);
            final int[] multinomialCoeffs = new int[j + nijd];
            Arrays.fill(multinomialCoeffs, 0, j, i);
            Arrays.fill(multinomialCoeffs, j, multinomialCoeffs.length, d);
            final Z m = Binomial.multinomial(mN, multinomialCoeffs);
            final Z t = fij.multiply(fdp).multiply(m).divide(fj).divide(mF.factorial(nijd));
            sum = sum.add(t);
          }
        }
      }
    }
    return sum;
  }
}
