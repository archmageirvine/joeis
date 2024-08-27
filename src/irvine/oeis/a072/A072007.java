package irvine.oeis.a072;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072007 a(0) = 0; for n&gt;=1, a(n)=least nonnegative integer x such that |x-a(n-1)|&gt;=n and x is not a(k) for any k&lt;n.
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
