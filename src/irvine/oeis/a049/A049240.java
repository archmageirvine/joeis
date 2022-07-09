package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a010.A010052;

/**
 * A049240 Smallest nonnegative value taken on by x^2 - n*y^2 for an infinite number of integer pairs (x, y).
 * @author Sean A. Irvine
 */
public class A049240 extends A010052 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
