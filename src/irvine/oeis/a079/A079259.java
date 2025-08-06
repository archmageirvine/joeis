package irvine.oeis.a079;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079259 a(n) is taken to be the smallest positive integer greater than a(n-1) such that the condition "n is in the sequence if and only if a(n) and a(n+1) are both odd" can be satisfied.
 * @author Sean A. Irvine
 */
public class A079259 extends Sequence1 {

  private final TreeSet<Long> mForcedOdd = new TreeSet<>();
  private long mN = 1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mForcedOdd.isEmpty()) {
      mForcedOdd.add(2L);
      return mA;
    }
    final boolean parity = mA.testBit(0);
    if (mForcedOdd.first() == ++mN) {
      mForcedOdd.pollFirst();
      mA = mA.add(parity ? 4 : 1);
    } else {
      mA = mA.add(parity ? 1 : 4);
    }
    final long t = mA.longValueExact();
    mForcedOdd.add(t);
    mForcedOdd.add(t + 1);
    return mA;
  }
}

