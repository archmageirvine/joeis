package irvine.oeis.a060;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A060176 Square array A(n,k) = the largest power of k-th prime which divides n, read by falling antidiagonals.
 * @author Sean A. Irvine
 */
public class A060176 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A060176() {
    super(1, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(int n, final int m) {
        int cnt = 0;
        final int p = Functions.PRIME.i(m);
        while (n % p == 0) {
          n /= p;
          ++cnt;
        }
        return Functions.PRIME.z(m).pow(cnt);
      }
    });
  }
}
