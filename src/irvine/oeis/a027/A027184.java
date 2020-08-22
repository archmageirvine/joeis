package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027184 a(n) = (1/2)*(n-th largest even number in array T given by A027170).
 * @author Sean A. Irvine
 */
public class A027184 extends A027183 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
