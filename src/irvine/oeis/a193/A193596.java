package irvine.oeis.a193;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A193596 Triangle given by p(n,k) = ceiling(C(n,k)/2).
 * @author Georg Fischer
 */
public class A193596 extends Triangle {

  @Override
  public Z next() {
    final Z binom = super.next();
    return binom.isEven() ? binom.divide2() : binom.add(1).divide2();
  }
}
