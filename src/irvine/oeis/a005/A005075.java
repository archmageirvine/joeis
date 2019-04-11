package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005075 Sum of squares of primes <code>= 2 mod 3</code> dividing n.
 * @author Sean A. Irvine
 */
public class A005075 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z p : Cheetah.factor(++mN).toZArray()) {
      if (p.mod(3) == 2) {
        s = s.add(p.square());
      }
    }
    return s;
  }
}

