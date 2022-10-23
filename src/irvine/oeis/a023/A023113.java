package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023113 Squares that remain square when the digit 6 is appended.
 * @author Sean A. Irvine
 */
public class A023113 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      if (s.multiply(10).add(6).isSquare()) {
        return s;
      }
    }
  }
}
