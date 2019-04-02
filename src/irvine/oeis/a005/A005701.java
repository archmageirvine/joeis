package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005701 Number of exterior points formed by extending diagonals of n-gon in general position.
 * @author Sean A. Irvine
 */
public class A005701 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.multiply(mN + 1).multiply(mN + 2).multiply(mN + 5).divide(12);
  }
}
