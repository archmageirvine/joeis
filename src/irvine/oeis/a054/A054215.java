package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054215 Squares that are concatenations of two consecutive decreasing numbers.
 * @author Sean A. Irvine
 */
public class A054215 extends Sequence1 {

  private long mN = 81;

  @Override
  public Z next() {
    while (true) {
      final Z s = new Z(++mN + String.valueOf(mN - 1));
      if (s.isSquare()) {
        return s;
      }
    }
  }
}

