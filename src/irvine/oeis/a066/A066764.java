package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066764 Numbers k such that (k, sigma(k)) lies on a circle with integral radius centered at the origin, i.e., k^2 + sigma(k)^2 is a square.
 * @author Sean A. Irvine
 */
public class A066764 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).square().add(mN * mN).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

