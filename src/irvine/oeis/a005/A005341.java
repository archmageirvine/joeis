package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005341 Length of n-th term in Look and Say sequences A005150 and A007651.
 * @author Sean A. Irvine
 */
public class A005341 extends A005150 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString().length());
  }
}
