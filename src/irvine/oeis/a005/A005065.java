package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005065 Sum of 4th powers of primes dividing n.
 * @author Sean A. Irvine
 */
public class A005065 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      if (!Z.ONE.equals(p)) {
        s = s.add(p.pow(4));
      }
    }
    return s;
  }
}

