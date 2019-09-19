package irvine.oeis.a026;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026148.
 * @author Sean A. Irvine
 */
public class A026148 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || n == 1) {
      return Z.ONE;
    }
    if (n == 2) {
      return m == 2 ? Z.TWO : Z.ONE;
    }
    if (m == 1) {
      return Z.valueOf(n - 1);
    }
    if (m == n + 2) {
      return get(n - 1, m - 2).add(get(n - 1, m - 1));
    }
    return get(n - 1, m - 2).add(get(n - 1, m - 1)).add(get(n - 1, m));
  }

  @Override
  public Z next() {
    if (mN < 2) {
      ++mN;
      return Z.ONE;
    }
    if (++mM > mN + 2) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
