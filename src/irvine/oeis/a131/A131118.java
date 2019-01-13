package irvine.oeis.a131;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A131118.
 * @author Sean A. Irvine
 */
public class A131118 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final long n = ++mN / 4;
    switch ((int) (mN & 3)) {
    case 0:
      return Z.valueOf(n).square().negate();
    case 1:
      return Z.valueOf(n).square();
    case 2:
      return Z.ONE.subtract(Z.valueOf(n).square());
    default:
      return Z.valueOf(n).multiply(Z.valueOf(n + 1));
    }
  }
}

