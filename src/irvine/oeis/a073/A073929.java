package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073929 a(1) = 1, a(n) = smallest number not included earlier such that the n-th partial sum (n&gt;1) is divisible by n+1.
 * @author Sean A. Irvine
 */
public class A073929 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mSum = null;
  private long mN = 2;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ONE;
      return Z.ONE;
    }
    ++mN;
    long k = 1;
    while (true) {
      if (!mUsed.contains(++k)) {
        final Z t = mSum.add(k);
        if (t.mod(mN) == 0) {
          mSum = t;
          mUsed.add(k);
          return Z.valueOf(k);
        }
      }
    }
  }
}

