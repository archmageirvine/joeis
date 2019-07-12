package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a008.A008578;

/**
 * A024460 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k)</code>, where k <code>= [ (n+1)/2 ], s =</code> (Fibonacci numbers), <code>t = (1, p(1), p(2), ...)</code>.
 * @author Sean A. Irvine
 */
public class A024460 implements Sequence {

  private final MemorySequence mA000045 = MemorySequence.cachedSequence(new A000045());
  private final MemorySequence mA008578 = MemorySequence.cachedSequence(new PrependSequence(new A008578(), 0));
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= (mN + 1) / 2; ++k) {
      sum = sum.add(mA000045.a(k).multiply(mA008578.a(mN + 1 - k)));
    }
    return sum;
  }
}
