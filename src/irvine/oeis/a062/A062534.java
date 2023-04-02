package irvine.oeis.a062;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A062501.
 * @author Sean A. Irvine
 */
public class A062534 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A062534() {
    super(0, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int n, final int m) {
        if (m == 0) {
          return Z.ONE;
        }
        if (n == 0) {
          return (m & 1) == 0 ? Z.valueOf(m + 1) : Z.valueOf(-m - 1);
        }
        return get(n - 1, m).add(get(n, m - 1));
      }
    });
  }
}

