package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a005.A005279;

/**
 * A010814.
 * @author Sean A. Irvine
 */
public class A010814 extends A005279 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
