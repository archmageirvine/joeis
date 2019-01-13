package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000623.
 * @author Sean A. Irvine
 */
public class A000623 extends A000620 {

  @Override
  public Z next() {
    super.next();
    return mTs.get(mN);
  }
}
