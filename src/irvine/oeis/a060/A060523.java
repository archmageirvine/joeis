package irvine.oeis.a060;

import java.util.Arrays;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060523 Triangle T(n,k) = number of degree-n permutations with k even cycles, k=0..n.
 * @author Sean A. Irvine
 */
public class A060523 extends Sequence0 {

  // After Alois P. Heinz

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private int mM = 0;

  private final MemoryFunctionInt2<Polynomial<Z>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Polynomial<Z> compute(final int n, final int m) {
      if (n == 0) {
        return RING.one();
      }
      if (m < 1) {
        return RING.zero();
      }
      Polynomial<Z> sum = RING.zero();
      for (int j = 0; j <= n / m; ++j) {
        final int[] bottom = new int[j + 1];
        Arrays.fill(bottom, m);
        bottom[0] = n - m * j;
        final Z mul = Binomial.multinomial(n, bottom).multiply(Functions.FACTORIAL.z(m - 1).pow(j)).divide(Functions.FACTORIAL.z(j));
        final Polynomial<Z> t = RING.multiply(get(n - m * j, m - 1), mul).shift((m & 1) == 0 ? j : 0);
        sum = RING.add(sum, t);
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mN).coeff(mM);
  }
}
