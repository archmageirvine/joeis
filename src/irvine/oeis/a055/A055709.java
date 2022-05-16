package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055709 Numbers k such that k | sigma_5(k).
 * @author Sean A. Irvine
 */
public class A055709 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma(5).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
