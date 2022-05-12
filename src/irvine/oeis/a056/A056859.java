package irvine.oeis.a056;

import irvine.math.MemoryFunctionInt3;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056859 Triangle of number of falls in set partitions of n.
 * @author Sean A. Irvine
 */
public class A056859 extends MemoryFunctionInt3<Polynomial<Z>> implements Sequence {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;
  private int mM = 0;

  @Override
  protected Polynomial<Z> compute(final int n, final int i, final int m) {
    return n == 0 ? RING.x() : RING.sum(1, m + 1, j -> get(n - 1, j, Math.max(m, j)).shift(j < i ? 1 : 0));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, 1, 0).coeff(mM);
  }
}
