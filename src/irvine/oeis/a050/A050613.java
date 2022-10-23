package irvine.oeis.a050;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000032;

/**
 * A050613 Products of distinct terms of 1 and rest from A001566: a(n) = Product_{i=0..floor(log_2(n+1))} L(2^i)^bit(n,i).
 * @author Sean A. Irvine
 */
public class A050613 extends Sequence0 {

  private final MemorySequence mL = MemorySequence.cachedSequence(new A000032());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 0; k <= IntegerUtils.lg(mN + 1); ++k) {
      if ((mN & (1 << k)) != 0) {
        prod = prod.multiply(mL.a(1 << k));
      }
    }
    return prod;
  }
}
