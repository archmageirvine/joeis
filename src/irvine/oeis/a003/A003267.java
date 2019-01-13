package irvine.oeis.a003;

import irvine.math.z.Z;

/**
 * A003267.
 * @author Sean A. Irvine
 */
public class A003267 extends A003268 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    final Z r = super.next();
    super.next();
    return r;
  }

}
