package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A001891.
 * @author Sean A. Irvine
 */
public class A001891 extends A000045 {

  private long mN = 3;

  {
    super.next();
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    mN += 2;
    return super.next().subtract(mN);
  }
}
