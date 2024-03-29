package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005067 Sum of cubes of odd primes dividing n.
 * @author Sean A. Irvine
 */
public class A005067 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      if (Z.TWO.compareTo(p) < 0) {
        s = s.add(p.pow(3));
      }
    }
    return s;
  }
}

