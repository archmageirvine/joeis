package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071532.
 * @author Sean A. Irvine
 */
public class A071638 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long pop = Long.bitCount(++mN);
      if (Functions.PHI.z(mN).equals(Z.valueOf(pop).pow(Functions.DIGIT_LENGTH.l(2, mN) - pop))) {
        return Z.valueOf(mN);
      }
    }
  }
}
