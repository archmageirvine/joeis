package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A000057 Primes dividing all Fibonacci sequences.
 * @author Sean A. Irvine
 */
public class A064416 extends Sequence0 {

  private final Sequence mA = new A064415();
  private final long[] mCounts = new long[100]; // way bigger than we can count with this code
  private long mLim = 0;
  private long mM = 0;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mLim = mLim == 0 ? 1 : mLim * 3;
    while (mM <= mLim) {
      ++mCounts[mA.next().intValueExact()];
      ++mM;
    }
    return Z.valueOf(mCounts[mN]);
  }
}

