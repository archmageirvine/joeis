package irvine.oeis.a039;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000045;

/**
 * A039948 A triangle related to A000045 (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A039948 extends Sequence0 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private final MemorySequence mFibo = MemorySequence.cachedSequence(new A000045());
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mF.factorial(mN).divide(mF.factorial(mM)).multiply(mFibo.a(mN - mM + 1));
  }
}
