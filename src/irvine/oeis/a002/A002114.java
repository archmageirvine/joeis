package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000436;

/**
 * A002114.
 * @author Sean A. Irvine
 */
public class A002114 extends A000436 {

  private int mN = 1;

  {
    super.next();
  }

  @Override
  public Z next() {
    mN += 2;
    return super.next().shiftRight(mN);
  }
}
