package irvine.oeis.a077;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077093 Smallest initial values leading to fixed points listed in A077092.
 * @author Sean A. Irvine
 */
public class A077093 extends Sequence1 {

  private long mN = 0;
  private final HashSet<Z> mSeen = new HashSet<>();

  private Z f(final Z n) {
    return Functions.PHI.z(Functions.SIGMA1.z(n).subtract(Functions.PHI.z(n)));
  }

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
      return Z.ONE;
    }
    while (true) {
      final HashSet<Z> seen = new HashSet<>();
      final Z n = Z.valueOf(++mN);
      Z t = n;
      seen.add(t);
      while (seen.add(t = f(t)) && t.compareTo(n) >= 0) {
        // do nothing
      }
      if (!t.isOne() && f(t).equals(t) && mSeen.add(t)) {
        return n;
      }
    }
  }
}

