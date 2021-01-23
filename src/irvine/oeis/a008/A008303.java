package irvine.oeis.a008;

import irvine.math.MemoryFunctionInt3;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008303 Number of permutations of [n] with k peaks, triangle read by rows, T(n,k) for n &gt;= 1 and 0 &lt;= k &lt;= ceiling(n/2)-1.
 * @author Sean A. Irvine
 */
public class A008303 extends MemoryFunctionInt3<Polynomial<Z>> implements Sequence {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Polynomial<Z> compute(final int u, final int o, final int t) {
    if (u + o == 0) {
      return RING.one();
    }
    Polynomial<Z> res = RING.zero();
    for (int j = 1; j <= u; ++j) {
      res = RING.add(res, get(u - j, o + j - 1, 1).shift(t == 2 ? 1 : 0));
    }
    for (int j = 1; j <= o; ++j) {
      res = RING.add(res, get(u + j - 1, o - j, 2));
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mM >= (mN + 1) / 2) {
      ++mN;
      mM = 0;
    }
    return get(mN, 0, 1).coeff(mM);
  }
}
