package irvine.oeis.a038;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038622 Triangular array that counts rooted polyominoes.
 * @author Sean A. Irvine
 */
public class A038622 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return m == 0 ? Z.ONE : Z.ZERO;
    }
    if (m == 0) {
      return get(n - 1, 0L).multiply2().add(get(n - 1, m + 1));
    }
    return get(n - 1, m - 1).add(get(n - 1, m)).add(get(n - 1, m + 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
