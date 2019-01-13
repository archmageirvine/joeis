package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000625.
 * @author Sean A. Irvine
 */
public class A000625 extends A000620 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    super.next();
    return mT.get(mN);
  }
}
