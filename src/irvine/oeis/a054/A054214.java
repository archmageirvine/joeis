package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054214 Numbers n such that n concatenated with n-1 is a square.
 * @author Sean A. Irvine
 */
public class A054214 extends Sequence1 {

  private long mN = 81;

  @Override
  public Z next() {
    while (true) {
      if (new Z(++mN + String.valueOf(mN - 1)).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

