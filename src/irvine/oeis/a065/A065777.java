package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065777 a(1) = 4; for n &gt; 1, a(n) is the square root of the smallest square &gt; a(n-1)^2 with a(n-1)^2 forming its final digits.
 * @author Sean A. Irvine
 */
public class A065777 extends A065776 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
