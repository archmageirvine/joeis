package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028883.
 * @author Sean A. Irvine
 */
public class A028883 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().subtract(7);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
