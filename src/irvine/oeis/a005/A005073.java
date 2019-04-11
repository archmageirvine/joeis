package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005073 Sum of 4th powers of primes <code>= 1 mod 3</code> dividing n.
 * @author Sean A. Irvine
 */
public class A005073 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z p : Cheetah.factor(++mN).toZArray()) {
      if (p.mod(3) == 1 && !Z.ONE.equals(p)) {
        s = s.add(p.pow(4));
      }
    }
    return s;
  }
}

