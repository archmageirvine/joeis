package irvine.oeis.a077;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077202 a(1) = 1, a(n) = smallest number such that the concatenation of two successive terms gives a prime which has not occurred earlier.
 * @author Sean A. Irvine
 */
public class A077202 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final String t = mA.toString();
    mA = Z.NEG_ONE;
    while (true) {
      mA = mA.add(2);
      final Z u = new Z(t + mA);
      if (u.isProbablePrime() && mSeen.add(u)) {
        return mA;
      }
    }
  }
}

