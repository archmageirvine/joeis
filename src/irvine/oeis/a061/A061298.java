package irvine.oeis.a061;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A061298 Table by antidiagonals of rows of sequences where each row is binomial transform of preceding row and row 1 is (1,2,1,2,1,2,1,2,...).
 * @author Sean A. Irvine
 */
public class A061298 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A061298() {
    super(0, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int n, final int m) {
        return Z.valueOf(n).pow(m).multiply(3).subtract(Z.valueOf(n - 2).pow(m)).divide2();
      }
    });
  }
}
