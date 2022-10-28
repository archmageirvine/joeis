package irvine.oeis.a060;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A060137 Square array read by antidiagonals with T(n,k)=T(n,k-1)^2-n*T(n,k-1)+1 and T(n,0)=0.
 * @author Sean A. Irvine
 */
public class A060137 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A060137() {
    super(new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int n, final int m) {
        if (m == 0) {
          return Z.ZERO;
        }
        return get(n, m - 1).square().subtract(get(n, m - 1).multiply(n)).add(1);
      }
    });
  }
}

