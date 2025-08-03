package irvine.oeis.a079;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A079166 Square array read by antidiagonals of T(n,k)=(4k-2)*T(n,k-1)+T(n,k-2) with T(n,0)=1 and T(n,1)=n.
 * @author Sean A. Irvine
 */
public class A079166 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A079166() {
    super(0, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int n, final int m) {
        if (m == 0) {
          return Z.ONE;
        }
        if (m == 1) {
          return Z.valueOf(n);
        }
        return get(n, m - 1).multiply(4L * m - 2).add(get(n, m - 2));
      }
    });
  }
}
