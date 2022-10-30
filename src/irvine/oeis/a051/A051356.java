package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051356 Start with 0, run through primes &gt;=5, adding if -1 mod 6, subtracting if +1 mod 6.
 * @author Sean A. Irvine
 */
public class A051356 extends A000040 {

  {
    setOffset(0);
    super.next(); // 2
  }

  private Z mA = null;

  @Override
  public Z next() {
    final Z p = super.next();
    mA = mA == null ? Z.ZERO : mA.signedAdd(p.mod(6) == 5, p);
    return mA;
  }
}
