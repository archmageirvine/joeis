package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046667 a(n) = A046666(n)/2.
 * @author Sean A. Irvine
 */
public class A046667 extends A046666 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
