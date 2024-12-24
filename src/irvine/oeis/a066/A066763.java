package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066763 Numbers k such that (k, phi(k)) lies on a circle with integral radius centered at the origin, i.e., k^2 + phi(k)^2 is a square.
 * @author Sean A. Irvine
 */
public class A066763 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).square().add(mN * mN).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

