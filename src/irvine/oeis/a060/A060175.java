package irvine.oeis.a060;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a008.A008578;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A060175.
 * @author Sean A. Irvine
 */
public class A060175 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A060175() {
    super(1, new MemoryFunctionInt2<>() {
      private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A008578());

      @Override
      protected Z compute(int n, final int m) {
        int cnt = 0;
        final int p = mPrimes.a(m).intValueExact();
        while (n % p == 0) {
          n /= p;
          ++cnt;
        }
        return Z.valueOf(cnt);
      }
    });
  }
}
