package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020890.
 * @author Sean A. Irvine
 */
public class A020890 extends A020889 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
