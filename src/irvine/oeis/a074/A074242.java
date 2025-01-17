package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074242 Numbers n such that sigma(n+1) = reverse(sigma(n)).
 * @author Sean A. Irvine
 */
public class A074242 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.REVERSE.z(Functions.SIGMA1.z(++mN)).equals(Functions.SIGMA1.l(mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
