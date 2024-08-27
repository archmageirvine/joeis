package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a004.A004614;

/**
 * A071903 Number of x less than or equal to n and divisible only by primes congruent to 3 mod 4 (i.e., in A004614).
 * @author Sean A. Irvine
 */
public class A071903 extends A004614 {

  private long mA = super.next().longValueExact();
  private Z mM = Z.ZERO;
  private long mN = 0;

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    if (++mN == mA) {
      mA = super.next().longValueExact();
      mM = mM.add(1);
    }
    return mM;
  }
}
