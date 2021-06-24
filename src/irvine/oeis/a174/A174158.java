package irvine.oeis.a174;
// manually 2021-06-24

import irvine.math.z.Z;
import irvine.oeis.a001.A001263;

/**
 * A174158 Triangle read by rows: T(n,m) = (binomial(n - 1, m - 1)*binomial(n, m - 1)/m)^2.
 * T(n,m) = A001263(n,m)^2.
 * @author Georg Fischer
 */
public class A174158 extends A001263 {

  @Override
  public Z next() {
    return super.next().square();
  } // next
}
