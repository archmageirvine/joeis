package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063091 Prime(n) such that gcd(1+prime(n+1), 1+prime(n)) = gcd(-1+prime(n+1), -1+prime(n)).
 * @author Sean A. Irvine
 */
public class A063091 extends A000040 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.add(1).gcd(mA.add(1)).equals(t.subtract(1).gcd(mA.subtract(1)))) {
        return t;
      }
    }
  }
}
