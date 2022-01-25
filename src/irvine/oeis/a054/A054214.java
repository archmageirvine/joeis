package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054214 Numbers n such that n concatenated with n-1 is a square.
 * @author Sean A. Irvine
 */
public class A054214 implements Sequence {

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

