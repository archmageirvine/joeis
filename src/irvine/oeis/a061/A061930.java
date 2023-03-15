package irvine.oeis.a061;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A061930 Square array read by antidiagonals of T(n,k)=T(n-1,[k/2])+T(n-1,[k/3]) with T(0,0)=1.
 * @author Sean A. Irvine
 */
public class A061930 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A061930() {
    super(0, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int n, final int m) {
        if (n == 0) {
          return m == 0 ? Z.ONE : Z.ZERO;
        }
        return get(n - 1, m / 2).add(get(n - 1, m / 3));
      }
    });
  }
}
