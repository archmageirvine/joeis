package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007504;
import irvine.oeis.a024.A024450;

/**
 * A061850.
 * @author Sean A. Irvine
 */
public class A062022 extends A024450 {

  private final Sequence mA = new A007504();
  {
    mA.next();
  }
  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(++mN).subtract(mA.next().square());
  }
}
