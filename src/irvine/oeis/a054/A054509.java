package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a001.A001918;

/**
 * A054509 Log_b 6 where b is smallest primitive root (A001918) mod n-th prime.
 * @author Sean A. Irvine
 */
public class A054509 extends A001918 {

  /** Construct the sequence. */
  public A054509() {
    super(4);
  }

  {
    super.next(); // skip 2
    super.next(); // skip 3
    super.next(); // skip 5
  }

  @Override
  public Z next() {
    final Z b = super.next();
    long lg = 0;
    Z t = Z.ONE;
    while (!Z.SIX.equals(t)) {
      t = t.modMultiply(b, mP);
      ++lg;
    }
    return Z.valueOf(lg);
  }
}
