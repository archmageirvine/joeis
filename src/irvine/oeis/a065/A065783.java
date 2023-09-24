package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065783 a(1) = 6; for n &gt; 1, a(n) is the square root of the smallest square &gt; a(n-1)^2 with a(n-1)^2 forming its final digits.
 * @author Sean A. Irvine
 */
public class A065783 extends A065782 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
