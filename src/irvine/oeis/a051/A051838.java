package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A051838 Numbers k such that sum of first k primes divides product of first k primes.
 * @author Sean A. Irvine
 */
public class A051838 extends A002110 {

  private Z mSum = Z.ZERO;
  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      mSum = mSum.add(mP);
      if (p.mod(mSum).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
