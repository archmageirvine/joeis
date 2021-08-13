package irvine.oeis.a050;

import irvine.math.MemoryFunctionInt3;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050314 Triangle: a(n,k) = number of partitions of n whose xor-sum is k.
 * @author Sean A. Irvine
 */
public class A050314 extends MemoryFunctionInt3<Polynomial<Z>> implements Sequence {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private int mM = 0;

  @Override
  protected Polynomial<Z> compute(final int n, final int i, final int k) {
    if (n == 0) {
      return RING.monomial(Z.ONE, k);
    }
    if (i < 1) {
      return RING.zero();
    }
    Polynomial<Z> sum = RING.zero();
    for (int j = 0; j <= n / i; ++j) {
      sum = RING.add(sum, get(n - i * j, i - 1, (j & 1) == 0 ? k : i ^ k));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mN, 0).coeff(mM);
  }
}
