package irvine.oeis.a307;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A307877 Number of ways of partitioning the set of the first n positive squares into two subsets whose sums differ at most by 1.
 * @author Sean A. Irvine
 */
public class A307877 extends MemoryFunction2Sequence<Integer, Z> {

  private final ArrayList<Z> mS = new ArrayList<>();
  private int mN = -1;

  private Z s(final int n) {
    while (n >= mS.size()) {
      final int m = mS.size();
      if (m == 0) {
        mS.add(Z.ONE);
      } else {
        mS.add(mS.get(m - 1).add(m * (long) m));
      }
    }
    return mS.get(n);
  }

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m == 0) {
      return n <= 1 ? Z.ONE : Z.ZERO;
    }
    if (s(m).compareTo(n) < 0) {
      return Z.ZERO;
    }
    return get(n + m * m, m - 1).add(get(Math.abs(n - m * m), m - 1));
  }

  @Override
  public Z next() {
    return get(0, ++mN).add(1).divide2();
  }
}
