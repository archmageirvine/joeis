package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073671 Rearrangement of odd numbers such that sum of any three consecutive terms is prime.
 * @author Sean A. Irvine
 */
public class A073671 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.THREE;
      return Z.THREE;
    }
    long k = 3;
    final Z t = mA.add(mB);
    while (true) {
      k += 2;
      if (t.add(k).isProbablePrime() && mUsed.add(k)) {
        mA = mB;
        mB = Z.valueOf(k);
        return mB;
      }
    }
  }
}
