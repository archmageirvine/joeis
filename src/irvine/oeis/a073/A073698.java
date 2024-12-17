package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073698 a(n) is smallest prime not already in the sequence such that the sum of the first n terms is an n-th power.
 * @author Sean A. Irvine
 */
public class A073698 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      final Z t = Z.valueOf(++k).pow(mN).subtract(mSum);
      if (t.signum() > 0 && t.isProbablePrime() && mUsed.add(t)) {
        mSum = mSum.add(t);
        return t;
      }
    }
  }
}
