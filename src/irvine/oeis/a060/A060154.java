package irvine.oeis.a060;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A060154 Table T(n,k) by antidiagonals of n^k mod k [n,k &gt;= 1].
 * @author Sean A. Irvine
 */
public class A060154 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A060154() {
    super(1, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int n, final int m) {
        final Z k = Z.valueOf(m);
        return Z.valueOf(n).modPow(k, k);
      }
    });
  }
}
