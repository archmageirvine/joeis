package irvine.oeis.a059;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059513 Variation of Boustrophedon transform applied to 1,1,1,1,... Fill an array by diagonals, in alternating directions. The first entry is 1 each time. For the next element of a diagonal, add to the previous element the elements of the row and the column the new element is in. The final element of each diagonal gives a(n).
 * @author Sean A. Irvine
 */
public class A059513 extends MemoryFunctionInt2<Z> implements Sequence {

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int m) {
    final int bit = (n - m) & 1;
    if (bit == 0) {
      if (n == 0) {
        return Z.ONE;
      }
      return get(n - 1, m + 1)
        .add(Integers.SINGLETON.sum(0, n - 1, k -> get(m, k)))
        .add(Integers.SINGLETON.sum(0, m - 1, k -> get(k, n)));
    } else {
      if (n == m) {
        return Z.ONE;
      }
      return get(n + 1, m - 1)
        .add(Integers.SINGLETON.sum(0, n - 1, k -> get(m, k)))
        .add(Integers.SINGLETON.sum(0, m - 1, k -> get(k, n)));
    }
  }

  @Override
  public Z next() {
    ++mN;
    return (mN & 1) == 1 ? get(mN, 0) : get(0, mN);
  }
}
