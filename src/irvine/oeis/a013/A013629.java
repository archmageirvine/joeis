package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.a002.A002410;

/**
 * A013629.
 * @author Sean A. Irvine
 */
public class A013629 extends A002410 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf((long) Math.floor(mYRef));
  }
}
