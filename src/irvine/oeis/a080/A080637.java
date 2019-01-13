package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a007.A007378;

/**
 * A080637.
 * @author Sean A. Irvine
 */
public class A080637 extends A007378 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
