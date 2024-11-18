package irvine.oeis.a073;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A073135 Table by antidiagonals of T(n,k)=2n*T(n,k-1)-n^2*T(n,k-2)+T(n,k-4) starting with T(n,1)=1.
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
