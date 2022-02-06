package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a001.A001918;

/**
 * A054512 Log_b 9 where b is smallest primitive root (A001918) mod n-th prime.
 * @author Sean A. Irvine
 */
public class A054512 extends A001918 {

  {
    super.next(); // skip 2
    super.next(); // skip 3
    super.next(); // skip 5
    super.next(); // skip 7
  }

  @Override
  public Z next() {
    Z b = super.next();
    long lg = 0;
    Z t = Z.ONE;
    while (!Z.NINE.equals(t)) {
      t = t.modMultiply(b, mP);
      ++lg;
    }
    return Z.valueOf(lg);
  }
}
