package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000045;

/**
 * A028412 Rectangular array of numbers Fibonacci(m(n+1))/Fibonacci(m), m &gt;= 1, n &gt;= 0, read by downward antidiagonals.
 * @author Sean A. Irvine
 */
public class A028412 extends Sequence0 {

  private final MemorySequence mF = MemorySequence.cachedSequence(new A000045());
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    final int t = mN - mM;
    return mF.a(t * (mM + 1)).divide(mF.a(t));
  }
}

