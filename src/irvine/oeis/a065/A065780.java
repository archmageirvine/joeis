package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a061.A061839;

/**
 * A065780 a(1) = 5; for n &gt; 1, a(n) is the square root of the smallest square &gt; a(n-1)^2 with a(n-1)^2 forming its final digits.
 * @author Sean A. Irvine
 */
public class A065780 extends A061839 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
