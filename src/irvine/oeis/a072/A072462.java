package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072462 Numbers k such that sigma(k) == 3 (mod 4).
 * @author Sean A. Irvine
 */
public class A072462 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).mod(4) == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
