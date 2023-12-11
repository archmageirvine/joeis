package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;
import irvine.oeis.a007.A007318;
import irvine.oeis.memory.MemorySequence;

/**
 * A045995 Rows of Fibonacci-Pascal triangle.
 * @author Sean A. Irvine
 */
public class A045995 extends A007318 {

  private final MemorySequence mFibo = MemorySequence.cachedSequence(new A000045());

  @Override
  public Z next() {
    return mFibo.a(super.next().intValueExact());
  }
}
