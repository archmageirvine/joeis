package irvine.oeis.a071;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A071283 Numerators of Peirce sequence of order 4.
 * @author Sean A. Irvine
 */
public class A071283 extends Sequence1 {

  private int mN = 0;

  // See p. 151 Concrete Mathematics
  protected final MemoryFunctionInt2<Pair<Integer, Integer>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Pair<Integer, Integer> compute(final int n, final int m) {
      switch (n) {
        case 1:
          return  new Pair<>(m - 1, 1);
        case 2:
          return m % 3 == 2 ? get(n - 1, m / 3 + 1) : new Pair<>(2 * (m - 1) / 3, n);
        case 3:
          return (m & 1) == 1 ? get(n - 1, m / 2 + 1) : new Pair<>((m - 1) / 2, n);
        case 4:
          final int r4 = m % 5;
          return r4 == 1 || r4 == 3 || r4 == 4 ? get(n - 1, 3 * m / 5 + 1) : new Pair<>(2 * (m - 1) / 5, n);
        case 5:
          final int r5 = m % 6;
          return r5 == 1 || r5 == 2 || r5 == 4 || r5 == 5 ? get(n - 1, 4 * m / 6 + 1) : new Pair<>(2 * (m - 1) / 6, n);
        case 6:
          final int r6 = m % 7;
          return r6 != 0 && r6 != 3 ? get(n - 1, 5 * m / 7 + 1) : new Pair<>(2 * (m - 1) / 7, n);
        default:
          throw new UnsupportedOperationException();
      }
    }
  };

  protected Z select(final Pair<Integer, Integer> q) {
    return Z.valueOf(q.left());
  }

  @Override
  public Z next() {
//    for (int m = 1; m < 5; ++m) {
//      final StringBuilder sb = new StringBuilder();
//      for (int k = 1; k < 20; ++k) {
//        sb.append(mB.get(m, k));
//      }
//      System.out.println(sb);
//    }
    return select(mB.get(4, ++mN));
  }
}
