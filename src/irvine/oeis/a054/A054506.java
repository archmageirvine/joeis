package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a001.A001918;

/**
 * A054506 Log_b 3 where b is smallest primitive root (A001918) mod n-th prime.
 * @author Sean A. Irvine
 */
public class A054506 extends A001918 {

  /** Construct the sequence. */
  public A054506() {
    super(3);
  }

  {
    super.next(); // skip 2
    super.next(); // skip 3
  }

  @Override
  public Z next() {
    final Z b = super.next();
    long lg = 0;
    Z t = Z.ONE;
    while (!Z.THREE.equals(t)) {
      t = t.modMultiply(b, mP);
      ++lg;
    }
    return Z.valueOf(lg);
  }
}
