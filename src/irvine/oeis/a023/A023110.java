package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023110 Squares which remain squares when the last digit is removed.
 * @author Sean A. Irvine
 */
public class A023110 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      if (s.divide(10).isSquare()) {
        return s;
      }
    }
  }
}
