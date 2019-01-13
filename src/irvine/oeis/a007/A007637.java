package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007637.
 * @author Sean A. Irvine
 */
public class A007637 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().multiply(3).subtract(mN.multiply(3)).add(23);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}

