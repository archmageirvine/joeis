package irvine.oeis.a075;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075311 a(1) = 1; for n &gt; 1, a(n) is the smallest number m &gt; a(n-1) such that the number of 1's in the binary expansion of m is not already in the sequence.
 * @author Sean A. Irvine
 */
public class A075311 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(1);
      if (!mUsed.contains((long) mA.bitCount())) {
        if (mA.bitLength() < Long.SIZE) { // We will run out of memory first
          mUsed.add(mA.longValue());
        }
        return mA;
      }
    }
  }
}
