package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073665 Rearrangement of even numbers such that a(n) + a(n+1) + 1 and a(n)*a(n+1) + 1 are primes for all n.
 * @author Sean A. Irvine
 */
public class A073665 extends Sequence1 {

  private Z mA = null;
  private final HashSet<Long> mUsed = new HashSet<>();

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    long k = 2;
    while (true) {
      k += 2;
      if (mA.add(k + 1).isProbablePrime() && mA.multiply(k).add(1).isProbablePrime() && mUsed.add(k)) {
        mA = Z.valueOf(k);
        return mA;
      }
    }
  }
}
