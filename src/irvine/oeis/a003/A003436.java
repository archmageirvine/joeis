package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003436.
 * @author Sean A. Irvine
 */
public class A003436 extends A003435 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().shiftRight(mN).divide(mF.factorial(mN));
  }
}

