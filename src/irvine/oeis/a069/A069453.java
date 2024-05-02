package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a035.A035789;

/**
 * A069453 Lonely twin primes.
 * @author Sean A. Irvine
 */
public class A069453 extends A035789 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = super.next();
      return mA;
    } else {
      final Z r = mA.add(2);
      mA = null;
      return r;
    }
  }
}

