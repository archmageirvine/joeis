package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020887.
 * @author Sean A. Irvine
 */
public class A020887 extends A020888 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
