package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A127315.
 * @author Sean A. Irvine
 */
public class A127315 implements Sequence {

  private static final Z NINETEEN = Z.valueOf(19);
  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
      return Z.ONE;
    }
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Z nn = n.square();
      if (Z.ONE.equals(NINETEEN.modPow(nn, nn.square()))) {
        return n;
      }
    }
  }
}

