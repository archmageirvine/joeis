package irvine.oeis.a069;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069065.
 * @author Sean A. Irvine
 */
public class A069069 extends Sequence1 {

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      if (Euler.phi(mN++).multiply(mN).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

