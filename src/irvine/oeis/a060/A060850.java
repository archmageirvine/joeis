package irvine.oeis.a060;

import irvine.math.MemoryFunction1;
import irvine.math.group.PolynomialRing;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060850 Array of the coefficients A(n,k) in the expansion of Product_{i&gt;=1} 1/(1-x^i)^n  = Sum_{k&gt;=0} A(n,k)*x^k, n &gt;= 1, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A060850 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;
  private int mM = 0;

  private final MemoryFunction1<Polynomial<Z>> mA = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      if (n == 0) {
        return RING.one();
      }
      return RING.sum(1, n, k -> RING.multiply(get(n - k), IntegerPartition.partitions(k - 1)).shift(k - 1));
    }
  };

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return mA.get(mN).coeff(mM);
  }
}
