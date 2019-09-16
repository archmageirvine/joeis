package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023113 Numbers n such that n is square and remains square when digit 6 is appended.
 * @author Sean A. Irvine
 */
public class A023113 implements Sequence {

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
