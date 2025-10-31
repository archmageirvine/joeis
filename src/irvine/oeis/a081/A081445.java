package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081445 Smallest squares such that partial sums of the sequence plus 11 are primes.
 * @author Sean A. Irvine
 */
public class A081445 extends Sequence1 {

  private Z mSum = Z.valueOf(11);

  @Override
  public Z next() {
    long k = 0;
    while (true) {
      final Z t = Z.valueOf(6 * ++k).square();
      final Z s = mSum.add(t);
      if (s.isProbablePrime()) {
        mSum = s;
        return t;
      }
    }
  }
}
