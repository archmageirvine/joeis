package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a210.A210252;

/**
 * A001508.
 * @author Sean A. Irvine
 */
public class A001508 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return A210252.qStar(mN, mN + 2);
  }
}
