package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076074 Initial members of groups in A076077.
 * @author Sean A. Irvine
 */
public class A076074 extends A076077 {

  private long mN = -2;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
