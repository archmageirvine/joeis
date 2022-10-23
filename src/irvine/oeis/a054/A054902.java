package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054902 Composite numbers n such that sigma(n)+12 = sigma(n+12).
 * @author Sean A. Irvine
 */
public class A054902 extends Sequence1 {

  private long mN = 64;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma().add(12).equals(Jaguar.factor(mN + 12).sigma())) {
        final Z n = Z.valueOf(mN);
        if (!n.isProbablePrime()) {
          return n;
        }
      }
    }
  }
}
