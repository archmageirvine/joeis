package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023113.
 * @author Sean A. Irvine
 */
public class A023113 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      final Z t = s.multiply(10).add(6);
      t.sqrt();
      if (t.auxiliary() == 1) {
        return s;
      }
    }
  }
}
