package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a006.A006012;

/**
 * A056236.
 * @author Sean A. Irvine
 */
public class A056236 extends A006012 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
