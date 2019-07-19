package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023114 Numbers n such that n remains square when digit 9 is appended.
 * @author Sean A. Irvine
 */
public class A023114 implements Sequence {

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
