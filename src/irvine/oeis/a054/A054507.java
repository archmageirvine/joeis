package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a001.A001918;

/**
 * A054507 Log_b 4 where b is smallest primitive root (A001918) mod n-th prime.
 * @author Sean A. Irvine
 */
public class A054507 extends A001918 {

  {
    super.next(); // skip 2
    super.next(); // skip 3
  }

  @Override
  public Z next() {
    final Z b = super.next();
    long lg = 0;
    Z t = Z.ONE;
    while (!Z.FOUR.equals(t)) {
      t = t.modMultiply(b, mP);
      ++lg;
    }
    return Z.valueOf(lg);
  }
}
