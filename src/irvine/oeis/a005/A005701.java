package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005701.
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
