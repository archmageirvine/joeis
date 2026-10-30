package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A395158 Number of 2-connected claw-free labeled cubic graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A058931 extends Sequence1 {

  private final Sequence mA = new A058930().skip();
  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    if (mN % 6 == 0) {
      return mA.next();
    }
    return mN == 4 ? Z.ONE : Z.ZERO;
  }
}
