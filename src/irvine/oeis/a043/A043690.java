package irvine.oeis.a043;
// manually 2021-03-04

import irvine.math.z.Z;

/**
 * A043690 (s(n)-1)/2, where s(n) = n-th number whose base 2 representation has exactly 9 runs.
 * @author Georg Fischer
 */
public class A043690 extends A043576 {

  @Override
  public Z next() {
    return super.next().subtract(Z.ONE).divide2();
  }
}
