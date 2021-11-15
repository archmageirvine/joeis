package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A134521 Triangle read by rows: T(n,k) = binomial(n,k) + (n + k) mod 2.
 * @author Georg Fischer
 */
public class A134521 extends Triangle {

  @Override
  public Z next() {
    return super.next().add((mRow + mCol) & 1);
  }
}
