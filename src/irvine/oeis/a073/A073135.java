package irvine.oeis.a073;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A072339.
 * @author Sean A. Irvine
 */
public class A073135 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A073135() {
    super(1, new MemoryFunctionInt2<Z>() {
      @Override
      protected Z compute(final int n, final int m) {
        if (m == 1) {
          return Z.ONE;
        }
        if (m < 1) {
          return Z.ZERO;
        }
        return get(n, m - 1).multiply(2L * n).subtract(get(n, m - 2).multiply((long) n * n)).add(get(n, m - 4));
      }
    });
  }
}
