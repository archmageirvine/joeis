package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007811 Numbers k for which 10k+1, 10k+3, 10k+7 and 10k+9 are primes.
 * @author Sean A. Irvine
 */
public class A007811 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.TEN.multiply(++mN);
      if (t.add(1).isProbablePrime() && t.add(3).isProbablePrime() && t.add(7).isProbablePrime() && t.add(9).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
