package irvine.oeis.a072;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071115.
 * @author Sean A. Irvine
 */
public class A072007 extends Sequence0 {

  private final HashSet<Long> mSeen = new HashSet<>();
  private long mA = 0;

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add(0L);
      return Z.ZERO;
    }
    long t = 0;
    while (true) {
      ++t;
      if (Math.abs(t - mA) >= mSeen.size() && mSeen.add(t)) {
        mA = t;
        return Z.valueOf(t);
      }
    }
  }
}
