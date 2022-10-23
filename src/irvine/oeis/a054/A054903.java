package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054903 Composite numbers n such that sigma(n)+6 = sigma(n+6), where sigma=A000203.
 * @author Sean A. Irvine
 */
public class A054903 extends Sequence1 {

  private long mN = 64;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma().add(6).equals(Jaguar.factor(mN + 6).sigma())) {
        final Z n = Z.valueOf(mN);
        if (!n.isProbablePrime()) {
          return n;
        }
      }
    }
  }
}
