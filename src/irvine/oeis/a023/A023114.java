package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023114 Squares that remain square when the digit 9 is appended.
 * @author Sean A. Irvine
 */
public class A023114 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      if (s.multiply(10).add(9).isSquare()) {
        return s;
      }
    }
  }
}
