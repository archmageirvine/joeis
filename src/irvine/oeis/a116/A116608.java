package irvine.oeis.a116;

import irvine.math.MemoryFunction2;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.triangle.DirectArray;

/**
 * A116608 Triangle read by rows: T(n,k) is number of partitions of n having k distinct parts (n&gt;=1, k&gt;=1).
 * @author Georg Fischer
 */
public class A116608 extends Sequence1 implements DirectArray {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private long mN = 1;
  private long mM = -1;

  private final MemoryFunction2<Long, Polynomial<Z>> mB = new MemoryFunction2<>() {
    @Override
    protected Polynomial<Z> compute(final Long n, final Long i) {
      if (n == 0) {
        return RING.one();
      }
      if (i < 1) {
        return RING.zero();
      }
      return RING.add(get(n, i - 1), RING.sum(1, n / i, j -> get(n - i * j, i - 1)).shift(1));
    }
  };

  @Override
  public Z next() {
    if (++mM >= mB.get(mN, mN).degree()) {
      ++mN;
      mM = 0;
    }
    final Polynomial<Z> b = mB.get(mN, mN);
    return b.coeff(mM + 1);
  }

  @Override
  public Z a(final long n, final long k) {
    final Polynomial<Z> b = mB.get(n, n);
    return k < 0 || k > b.degree() ? Z.ZERO : b.coeff(k + 1);
  }

}
