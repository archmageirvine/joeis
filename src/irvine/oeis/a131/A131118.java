package irvine.oeis.a131;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A131118 <code>a(4n) = -n^2, a(4n+1) = n^2, a(4n+2) = 1-n^2, a(4n+3) = n*(n+1)</code>.
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

