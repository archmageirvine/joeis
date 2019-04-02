package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000920 Differences of 0: 6!*Stirling2(n,6).
 * @author Sean A. Irvine
 */
public class A000920 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Stirling.secondKind(++mN, 6).multiply(720);
  }
}
