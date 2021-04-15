package irvine.oeis.a043;
// manually 2021-03-04

import irvine.math.z.Z;

/**
 * A043684 a(n) = (1/2)*(n-th number whose base-2 representation has exactly 8 runs).
 * @author Georg Fischer
 */
public class A043684 extends A043575 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
