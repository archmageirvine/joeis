package irvine.oeis.a086;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086553 a(1) = 1, a(n) = smallest number not included earlier such that both a(n) + 1 and a(n)*a(n-1) + 1 are primes.
 * @author Sean A. Irvine
 */
public class A086553 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    long p = 2;
    while (true) {
      p = Functions.NEXT_PRIME.l(p);
      if (!mUsed.contains(p) && mA.multiply(p - 1).add(1).isProbablePrime()) {
        mUsed.add(p);
        mA = Z.valueOf(p - 1);
        return mA;
      }
    }
  }
}

