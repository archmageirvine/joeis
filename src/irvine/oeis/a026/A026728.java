package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A026728 a(n) = number of primes of the form k*(n-k) + 1.
 * @author Sean A. Irvine
 */
public class A026728 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 0;
    for (Z k = mN.divide2(); k.signum() > 0; k = k.subtract(1)) {
      if (k.multiply(mN.subtract(k)).add(1).isProbablePrime()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
