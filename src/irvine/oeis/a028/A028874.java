package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028873.
 * @author Sean A. Irvine
 */
public class A028874 implements Sequence {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().subtract(3);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
