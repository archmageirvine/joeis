package irvine.oeis.a043;
// manually 2021-03-04

import irvine.math.z.Z;

/**
 * A043689 a(n) = (s(n)-1)/2, where s(n) is the n-th number whose base-2 representation has exactly 7 runs.
 * @author Georg Fischer
 */
public class A043689 extends A043574 {

  @Override
  public Z next() {
    return super.next().subtract(Z.ONE).divide2();
  }
}
