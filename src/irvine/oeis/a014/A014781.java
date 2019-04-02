package irvine.oeis.a014;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014781 Seidel's triangle, read by rows.
 * @author Sean A. Irvine
 */
public class A014781 extends MemoryFunction2<Integer, Z> implements Sequence {

  // After Jean-Fran&ccedil;ois Alcover

  private int mN = 0;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (n == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    if ((n & 1) == 0) {
      for (int j = k; j <= (n + 1) / 2; ++j) {
        sum = sum.add(get(n - 1, j));
      }
    } else {
      for (int j = 1; j <= k; ++j) {
        sum = sum.add(get(n - 1, j));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > (mN + 1) / 2) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }
}
