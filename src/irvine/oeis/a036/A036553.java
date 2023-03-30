package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000010;
import irvine.oeis.a000.A000040;

/**
 * A036553 a(n) = phi(prime(n))-prime(phi(n)).
 * @author Sean A. Irvine
 */
public class A036553 extends Sequence1 {

  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new PrependSequence(new A000040(), 0));
  private final MemorySequence mPhi = MemorySequence.cachedSequence(new PrependSequence(new A000010(), 0));
  private int mN = 0;

  @Override
  public Z next() {
    return mPhi.a(mPrimes.a(++mN).intValueExact()).subtract(mPrimes.a(mPhi.a(mN).intValueExact()));
  }
}
