package irvine.oeis.a030;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030528 Triangle read by rows: a(n,k) = binomial(k,n-k).
 * @author Sean A. Irvine
 */
public class A030528 extends MemoryFunction2<Integer, Z> implements Sequence {

  protected int mN = 0;
  protected int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n < m) {
      return Z.ZERO;
    }
    if (n == 1) {
      return m == 1 ? Z.ONE : Z.ZERO;
    }
    return get(n - 1, m).multiply(2L * m - n + 1).multiply2().add(get(n - 1, m - 1).multiply(m)).divide(n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
