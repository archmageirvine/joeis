package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074849 4-infinitary perfect numbers: numbers k such that 4-infinitary-sigma(k) = 2*k.
 * @author Sean A. Irvine
 */
public class A074849 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (Functions.INFINITARY_SIGMA1.z(4, ++mN).equals(2 * mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
