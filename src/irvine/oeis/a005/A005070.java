package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005070 Sum of primes == 1 (mod 3) dividing n.
 * @author Sean A. Irvine
 */
public class A005070 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      if (p.mod(3) == 1 && !Z.ONE.equals(p)) {
        s = s.add(p);
      }
    }
    return s;
  }
}

