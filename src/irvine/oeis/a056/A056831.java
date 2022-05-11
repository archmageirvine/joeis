package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A056831 LCM of composite numbers falling between n-th and (n+1)-st primes.
 * @author Sean A. Irvine
 */
public class A056831 extends A000040 {

  {
    super.next(); // skip 2
  }
  private Z mP = super.next();

  @Override
  public Z next() {
    final Z t = mP;
    mP = super.next();
    Z lcm = Z.ONE;
    for (Z k = t.add(1); k.compareTo(mP) < 0; k = k.add(1)) {
      lcm = lcm.lcm(k);
    }
    return lcm;
  }
}
