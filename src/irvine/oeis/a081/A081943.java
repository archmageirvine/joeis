package irvine.oeis.a081;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081943 a(1) = 1, a(n)= smallest number not occurring earlier such that a(n-1)*a(n) -1 is a prime. re-arrangement of natural numbers such that the product of adjacent terms is one more than a prime.
 * @author Sean A. Irvine
 */
public class A081943 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      Z t = Z.ONE;
      while (true) {
        t = t.add(1);
        if (mA.multiply(t).subtract(1).isProbablePrime() && mSeen.add(t)) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}
