package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003325 Numbers that are the sum of 2 positive cubes.
 * @author Sean A. Irvine
 */
public class A003325 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z n = Z.valueOf(mN);
      final Z lower = n.root(3);
      final Z upper = n.multiply(4).root(3);
      for (final Z m : Cheetah.factor(mN).divisors()) {
        if (m.compareTo(lower) >= 0 && m.compareTo(upper) <= 0) {
          final Z m2 = m.square();
          final Z t = m2.subtract(n.divide(m));
          if (t.signum() > 0 && t.mod(3) == 0) {
            final Z l = t.divide(3);
            final Z z = m2.subtract(l.multiply(4));
            final Z[] y = z.sqrtAndRemainder();
            if (Z.ZERO.equals(y[1])) {
              return n;
            }
          }
        }
      }
    }
  }
}
