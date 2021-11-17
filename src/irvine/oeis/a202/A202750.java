package irvine.oeis.a202;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A202750 Triangle T(n,k) = binomial(n,k)^4 read by rows, 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A202750 extends Triangle {

  @Override
  public Z next() {
    return super.next().pow(4);
  }
}
