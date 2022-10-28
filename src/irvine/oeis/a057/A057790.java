package irvine.oeis.a057;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A057790 Table read by antidiagonals: T(n,k) = number of restricted knight's walks from (n,k) (n &gt;= 0, k &gt;= 0).
 * @author Sean A. Irvine
 */
public class A057790 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A057790() {
    super(new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int n, final int k) {
        if (n <= 1 || k <= 1) {
          return Z.ONE;
        }
        return get(n + 1, k - 2).add(get(n - 2, k + 1));
      }
    });
  }
}
