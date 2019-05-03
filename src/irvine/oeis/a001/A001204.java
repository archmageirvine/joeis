package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001204 Continued fraction for <code>e^2</code>.
 * @author Sean A. Irvine
 */
public class A001204 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.SEVEN;
    }
    final Z n = Z.valueOf(mN / 5);
    switch ((int) (mN % 5)) {
    case 0:
      return n.multiply(12).add(6);
    case 1:
      return n.multiply(3).add(2);
    case 4:
      return n.multiply(3).add(3);
    default:
      return Z.ONE;
    }
  }
}
