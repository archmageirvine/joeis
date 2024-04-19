package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A018238 Add 1 to leading digit and put in front.
 * @author Sean A. Irvine
 */
public class A018238 extends Sequence1 {

  private int mN = 0;
  private String mA = null;

  @Override
  public Z next() {
    mA = mA == null ? "" : mA + mN + mA;
    return new Z(++mN + mA);
  }
}

