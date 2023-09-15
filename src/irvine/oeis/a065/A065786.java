package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065786 a(1) = 7; for n &gt; 1 is a(n) the square root of the smallest square &gt; a(n-1)^2 with a(n-1)^2 forming its final digits.
 * @author Sean A. Irvine
 */
public class A065786 extends A065785 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
