package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073476 Numbers k such that k^4 + 1, (k+2)^4 + 1 and (k+4)^4 + 1 are all primes.
 * @author Sean A. Irvine
 */
public class A073476 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (n.pow(4).add(1).isProbablePrime()
        && Z.valueOf(mN + 2).pow(4).add(1).isProbablePrime()
        && Z.valueOf(mN + 4).pow(4).add(1).isProbablePrime()) {
        return n;
      }
    }
  }
}
