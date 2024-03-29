package irvine.oeis.a060;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A060155 Table T(n,k) by antidiagonals of floor(n^k/k) [n,k &gt;= 1].
 * @author Sean A. Irvine
 */
public class A060155 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A060155() {
    super(1, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int n, final int m) {
        return Z.valueOf(n).pow(m).divide(m);
      }
    });
  }
}
