package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065789 a(1) = 8; for n &gt; 1, a(n) is the square root of the smallest square &gt; a(n-1)^2 with a(n-1)^2 forming its final digits.
 * @author Sean A. Irvine
 */
public class A065789 extends A065788 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
