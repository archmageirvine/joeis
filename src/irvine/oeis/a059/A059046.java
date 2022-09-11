package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059046 Numbers n such that sigma(n)-n divides n-1.
 * @author Sean A. Irvine
 */
public class A059046 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(mN++).mod(Jaguar.factor(mN).sigma().subtract(mN)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
