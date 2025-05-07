package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383483 Numbers k such that k = sigma(m)-m where m = sigma(3*k)-3*k.
 * @author Sean A. Irvine
 */
public class A383483 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z m = Functions.SIGMA1.z(3 * mN).subtract(3 * mN);
      if (Functions.SIGMA1.z(m).subtract(m).equals(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

