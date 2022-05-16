package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055710 Numbers k such that k | sigma_6(k).
 * @author Sean A. Irvine
 */
public class A055710 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma(6).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
