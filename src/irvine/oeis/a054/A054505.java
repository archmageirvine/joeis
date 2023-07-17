package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a001.A001918;

/**
 * A054505 Log_b 2 where b is smallest primitive root (A001918) mod n-th prime.
 * @author Sean A. Irvine
 */
public class A054505 extends A001918 {

  /** Construct the sequence. */
  public A054505() {
    super(2);
  }

  {
    super.next(); // skip 2
  }

  @Override
  public Z next() {
    final Z b = super.next();
    long lg = 0;
    Z t = Z.ONE;
    while (!Z.TWO.equals(t)) {
      t = t.modMultiply(b, mP);
      ++lg;
    }
    return Z.valueOf(lg);
  }
}
