package irvine.oeis.a073;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A073134 Table by antidiagonals of T(n,k)=n*T(n,k-1)-T(n,k-2) starting with T(n,1)=1.
 * @author Sean A. Irvine
 */
public class A073134 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A073134() {
    super(1, new MemoryFunctionInt2<Z>() {
      @Override
      protected Z compute(final int n, final int m) {
        if (m == 1) {
          return Z.ONE;
        }
        if (m < 1) {
          return Z.ZERO;
        }
        return get(n, m - 1).multiply(n).subtract(get(n, m - 2));
      }
    });
  }
}
