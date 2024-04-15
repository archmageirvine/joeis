package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069070 Numbers n such that n*sigma(n) is a perfect square.
 * @author Sean A. Irvine
 */
public class A069070 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(++mN).multiply(mN).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

