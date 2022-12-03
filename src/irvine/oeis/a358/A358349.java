package irvine.oeis.a358;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A358349 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A358349 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A358349() {
    super(1, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int n, final int m) {
        if (n == 1) {
          return Z.valueOf(m);
        }
        if (m == 1) {
          return Z.ONE;
        }
        return get(n - 1, m - 1).multiply(get(n - 1, m)).add(get(n, m - 1));
      }
    });
  }
}
