package irvine.oeis.a062;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a052.A052542;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A062507 Table by antidiagonals related to partial sums and differences of Pell numbers (A000129).
 * @author Sean A. Irvine
 */
public class A062507 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A062507() {
    super(0, new MemoryFunctionInt2<>() {

      private final MemorySequence mRow0 = MemorySequence.cachedSequence(new A052542());

      @Override
      protected Z compute(final int n, final int m) {
        if (m <= 0) {
          return Z.ZERO;
        }
        if (m == 1) {
          return Z.ONE;
        }
        if (m == 2) {
          return Z.valueOf(n);
        }
        if (n == 0) {
          return mRow0.a(m - 2);
        }
        return get(n, m - 1).add(get(n - 1, m));
      }
    });
  }
}

