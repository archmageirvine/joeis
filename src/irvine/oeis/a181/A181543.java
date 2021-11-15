package irvine.oeis.a181;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A181543 Triangle of cubed binomial coefficients, T(n,k) = C(n,k)^3, read by rows.
 * @author Georg Fischer
 */
public class A181543 extends Triangle {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
