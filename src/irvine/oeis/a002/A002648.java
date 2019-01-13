package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002648.
 * @author Sean A. Irvine
 */
public class A002648 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final Z p = mN.square().multiply(3).add(1);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
