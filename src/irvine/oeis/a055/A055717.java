package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055717 Numbers n such that n | sigma_13(n).
 * @author Sean A. Irvine
 */
public class A055717 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma(13).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
