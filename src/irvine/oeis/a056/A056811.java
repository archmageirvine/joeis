package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a069.A069482;

/**
 * A056811 Number of primes not exceeding square root of n: primepi(sqrt(n)).
 * @author Sean A. Irvine
 */
public class A056811 extends A069482 {

  private Z mN = Z.ZERO;
  private long mM = 4;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mM = super.next().longValueExact();
      mN = mN.add(1);
    }
    return mN;
  }
}

