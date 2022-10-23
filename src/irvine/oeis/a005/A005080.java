package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005080 Sum of cubes of primes = 1 mod 4 dividing n.
 * @author Sean A. Irvine
 */
public class A005080 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      if (p.mod(4) == 1 && !Z.ONE.equals(p)) {
        s = s.add(p.pow(3));
      }
    }
    return s;
  }
}

