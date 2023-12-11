package irvine.oeis.a050;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000045;
import irvine.oeis.memory.MemorySequence;

/**
 * A050615 Products of distinct terms of Fibonacci(2^(i+2)): a(n) = Product_{i=0..floor(log_2(n+1))} F(2^(i+2))^bit(n,i).
 * @author Sean A. Irvine
 */
public class A050615 extends Sequence0 {

  private final MemorySequence mL = MemorySequence.cachedSequence(new A000045());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 0; k <= IntegerUtils.log2(mN + 1); ++k) {
      if ((mN & (1 << k)) != 0) {
        prod = prod.multiply(mL.a(1 << (k + 2)));
      }
    }
    return prod;
  }
}
