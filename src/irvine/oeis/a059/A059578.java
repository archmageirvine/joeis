package irvine.oeis.a059;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A059578 Variation of Boustrophedon transform applied to 1,1,1,1,... Fill an array by diagonals, all in the 'up' direction. The first column is 1,1,1,1,.... For the next element of a diagonal, add to the previous element the elements of the row and the column the new element is in. The first row gives a(n).
 * @author Sean A. Irvine
 */
public class A059578 extends MemoryFunctionInt2Sequence<Z> {

  /** Construct the sequence. */
  public A059578() {
    super(1);
  }

  private int mN = -1;

  @Override
  protected Z compute(final int n, final int m) {
    if (m == 0) {
      return Z.ONE;
    }
    return get(n + 1, m - 1)
      .add(Integers.SINGLETON.sum(0, n - 1, k -> get(k, m)))
      .add(Integers.SINGLETON.sum(0, m - 1, k -> get(n, k)));
  }

  @Override
  public Z next() {
    return get(0, ++mN);
  }
}
