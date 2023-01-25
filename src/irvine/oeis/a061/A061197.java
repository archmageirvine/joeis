package irvine.oeis.a061;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A061197 Table by antidiagonals T(n,k) of number of partitions of k where the largest part is less than or equal to n and where there are no more than two of any particular sized part.
 * @author Sean A. Irvine
 */
public class A061197 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A061197() {
    super(0, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(int n, final int m) {
        if (n < 0 || m < 0) {
          return Z.ZERO;
        }
        if (n == 0) {
          return m == 0 ? Z.ONE : Z.ZERO;
        }
        return get(n - 1, m).add(get(n - 1, m - n)).add(get(n - 1, m - 2 * n));
      }
    });
  }

  @Override
  public Z next() {
    return super.next();
  }
}
