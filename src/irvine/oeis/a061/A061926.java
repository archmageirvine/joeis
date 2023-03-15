package irvine.oeis.a061;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A061926 Square table by antidiagonals where odd rows are partial sums of previous row, even rows are sums of pairs of values in previous row and initial row is 0 and 1 alternating.
 * @author Sean A. Irvine
 */
public class A061926 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A061926() {
    super(0, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int n, final int m) {
        if (m == 0) {
          return Z.ZERO;
        }
        if (n == 0) {
          return Z.valueOf(m & 1);
        }
        if ((n & 1) == 0) {
          return get(n - 1, m - 1).add(get(n - 1, m));
        } else {
          return get(n, m - 1).add(get(n - 1, m));
        }
      }
    });
  }
}
