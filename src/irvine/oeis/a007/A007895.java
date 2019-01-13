package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a003.A003714;

/**
 * A007895.
 * @author Sean A. Irvine
 */
public class A007895 extends A003714 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitCount());
  }
}
