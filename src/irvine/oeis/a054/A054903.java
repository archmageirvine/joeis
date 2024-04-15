package irvine.oeis.a054;

import irvine.math.function.Functions;
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
      if (Functions.SIGMA.z(++mN).add(6).equals(Functions.SIGMA.z(mN + 6))) {
        final Z n = Z.valueOf(mN);
        if (!n.isProbablePrime()) {
          return n;
        }
      }
    }
  }
}
