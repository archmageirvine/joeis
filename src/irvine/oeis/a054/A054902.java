package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054902 Composite numbers n such that sigma(n)+12 = sigma(n+12).
 * @author Sean A. Irvine
 */
public class A054902 implements Sequence {

  private long mN = 64;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).sigma().add(12).equals(Cheetah.factor(mN + 12).sigma())) {
        final Z n = Z.valueOf(mN);
        if (!n.isProbablePrime()) {
          return n;
        }
      }
    }
  }
}
