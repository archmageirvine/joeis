package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038043.
 * @author Sean A. Irvine
 */
public class A038043 extends A038041 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
