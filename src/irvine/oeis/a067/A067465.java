package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067465 Numbers k such that sigma(k^2+1) is a perfect square.
 * @author Sean A. Irvine
 */
public class A067465 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN * mN + 1).sigma().isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

