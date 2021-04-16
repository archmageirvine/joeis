package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046674 a(n) = A046673(n)/2.
 * @author Sean A. Irvine
 */
public class A046674 extends A046673 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
