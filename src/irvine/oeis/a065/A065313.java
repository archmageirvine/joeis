package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;
import irvine.oeis.memory.MemorySequence;

/**
 * A065313 a(n) = Pi(n*Pi(n)).
 * @author Sean A. Irvine
 */
public class A065313 extends Sequence1 {

  private final MemorySequence mPrimePi = MemorySequence.cache(0, new A000720(), 0);
  private int mN = 0;

  @Override
  public Z next() {
    return mPrimePi.a(mPrimePi.a(++mN).multiply(mN).intValueExact());
  }
}
