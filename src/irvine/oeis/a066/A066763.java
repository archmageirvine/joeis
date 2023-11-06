package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066763 Numbers n such that (n, phi(n)) lies on a circle with integral radius centered at the origin, i.e., n^2 + phi(n)^2 is a square.
 * @author Sean A. Irvine
 */
public class A066763 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      if (Euler.phi(++mN).square().add(mN * mN).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

