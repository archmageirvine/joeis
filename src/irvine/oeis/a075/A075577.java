package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075577 k^2 is a term if k^2 + (k-1)^2 and k^2 + (k+1)^2 are primes.
 * @author Sean A. Irvine
 */
public class A075577 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN).square();
      final Z t = Z.valueOf(mN + 1).square();
      if (s.add(t).isProbablePrime() && t.add(Z.valueOf(mN + 2).square()).isProbablePrime()) {
        return t;
      }
    }
  }
}

