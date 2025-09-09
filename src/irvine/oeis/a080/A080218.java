package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080218 Monotonically increasing sequence such that every positive integer n appears if and only if d(n) doesn't (d(n)=number of divisors of n, A000005).
 * @author Sean A. Irvine
 */
public class A080218 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z d = Functions.SIGMA0.z(++mN);
      if (!mSeen.contains(d)) {
        final Z t = Z.valueOf(mN);
        mSeen.add(t);
        return t;
      }
    }
  }
}

