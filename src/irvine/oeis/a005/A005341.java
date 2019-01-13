package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005341.
 * @author Sean A. Irvine
 */
public class A005341 extends A005150 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString().length());
  }
}
