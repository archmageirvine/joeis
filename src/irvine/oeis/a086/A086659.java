package irvine.oeis.a086;

import java.util.Arrays;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A086659 T(n,k) counts the set partitions of n containing k-1 blocks of length 1.
 * @author Sean A. Irvine
 */
public class A086659 extends Sequence2 {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 1;
  private int mM = 0;
  private final MemoryFunctionInt2<Polynomial<Z>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Polynomial<Z> compute(final int n, final int i) {
      if (n == 0) {
        return RING.one();
      }
      if (i < 1) {
        return RING.zero();
      }
      Polynomial<Z> sum = RING.zero();
      for (int j = 0; j <= n / i; ++j) {
        final int[] lo = new int[j + 1];
        Arrays.fill(lo, i);
        lo[0] = n - i * j;
        final Z m = Binomial.multinomial(n, lo).divide(Functions.FACTORIAL.z(j));
        final Polynomial<Z> t = RING.multiply(get(n - i * j, i - 1), m).shift(i == 1 ? j : 0);
        sum = RING.add(sum, t);
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mM >= mN - 1) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mN).coeff(mM);
  }
}
