package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027184 <code>(1/2)*(n-th</code> largest even number in array T given by <code>A027170)</code>.
 * @author Sean A. Irvine
 */
public class A027184 extends A027183 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
