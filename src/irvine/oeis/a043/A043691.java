package irvine.oeis.a043;
// manually 2021-03-04

import irvine.math.z.Z;

/**
 * A043691 a(n) = (s(n)-1)/2, where s(n) is the n-th number whose base-2 representation has exactly 11 runs.
 * @author Georg Fischer
 */
public class A043691 extends A043578 {

  @Override
  public Z next() {
    return super.next().subtract(Z.ONE).divide2();
  }
}
