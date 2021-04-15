package irvine.oeis.a043;
// manually 2021-03-04

import irvine.math.z.Z;

/**
 * A043685 a(n) = (1/2)*(n-th number whose base-2 representation has exactly 10 runs).
 * @author Georg Fischer
 */
public class A043685 extends A043577 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
