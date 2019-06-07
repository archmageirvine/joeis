package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005070 Sum of primes <code>= 1 (mod 3)</code> dividing <code>n</code>.
 * @author Sean A. Irvine
 */
public class A005070 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z p : Cheetah.factor(++mN).toZArray()) {
      if (p.mod(3) == 1 && !Z.ONE.equals(p)) {
        s = s.add(p);
      }
    }
    return s;
  }
}

