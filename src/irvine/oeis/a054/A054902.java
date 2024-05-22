package irvine.oeis.a054;

import irvine.math.function.Functions;
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
      if (Functions.SIGMA1.z(++mN).add(12).equals(Functions.SIGMA1.z(mN + 12))) {
        final Z n = Z.valueOf(mN);
        if (!n.isProbablePrime()) {
          return n;
        }
      }
    }
  }
}
