package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005084 Sum of cubes of primes = 3 mod 4 dividing n.
 * @author Sean A. Irvine
 */
public class A005084 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z p : Cheetah.factor(++mN).toZArray()) {
      if (p.mod(4) == 3) {
        s = s.add(p.pow(3));
      }
    }
    return s;
  }
}

