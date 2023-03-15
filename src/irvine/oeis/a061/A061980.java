package irvine.oeis.a061;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A061980 Square array A(n,k) = A(n-1,k) + A(n-1, floor(k/2)) + A(n-1, floor(k/3)), with A(0,0) = 1, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A061980 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A061980() {
    super(0, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int n, final int m) {
        if (n == 0) {
          return m == 0 ? Z.ONE : Z.ZERO;
        }
        return get(n - 1, m).add(get(n - 1, m / 2)).add(get(n - 1, m / 3));
      }
    });
  }
}

