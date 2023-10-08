package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066322.
 * @author Sean A. Irvine
 */
public class A066322 extends A066321 {

  private long mN = -16;

  @Override
  public Z next() {
    mN += 16;
    return f(mN + 4).subtract(f(mN + 3));
  }
}
