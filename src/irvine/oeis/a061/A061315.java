package irvine.oeis.a061;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A061315 Array read by antidiagonals: T(n,k)=T(n,k-1)*(T(n,k-1)+k-1)/k with T(n,1)=n.
 * @author Sean A. Irvine
 */
public class A061315 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A061315() {
    super(1, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int n, final int m) {
        if (m == 1) {
          return Z.valueOf(n);
        }
        final Z b = get(n, m - 1);
        final Z c = b.add(m - 1).multiply(b);
        if (c.mod(m) != 0) {
          throw new UnsupportedOperationException("non-integer");
        }
        return c.divide(m);
      }
    });
  }
}

