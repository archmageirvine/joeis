package irvine.oeis.a216;
// manually trixint0/parmof2 at 2023-06-27 08:10

import irvine.math.z.Z;

/**
 * A216953 Triangle read by rows: T(n,k) (n&gt;=1, 1&lt;=k&lt;=n) = number of binary sequences of length n with minimal period k.
 * @author Georg Fischer
 */
public class A216953 extends A216954 {

  @Override
  public Z triangleElement(final int n, final int k) {
    return super.triangleElement(n, k).multiply2();
  }
}
