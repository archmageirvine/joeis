package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007811 Numbers n for which <code>10n+1, 10n+3, 10n+7</code> and <code>10n+9</code> are primes.
 * @author Sean A. Irvine
 */
public class A007811 implements Sequence {

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
