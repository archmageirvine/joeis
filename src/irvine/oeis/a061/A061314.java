package irvine.oeis.a061;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A061314 Table by antidiagonals where T(n,k)=T(n,k-1)+T(n,k-1)^2/k^2 and T(n,0)=n.
 * @author Sean A. Irvine
 */
public class A061314 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A061314() {
    super(0, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int n, final int m) {
        if (m == 0) {
          return Z.valueOf(n);
        }
        final Z b = get(n, m - 1);
        if (b.mod(m) != 0) {
          throw new UnsupportedOperationException("non-integer");
        }
        return b.divide(m).square().add(b);
      }
    });
  }
}

