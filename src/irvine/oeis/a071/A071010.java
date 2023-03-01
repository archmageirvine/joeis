package irvine.oeis.a071;
// manually sigman1/sigma1 at 2023-03-01 09:30

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a022.A022544;

/**
 * A071010 Sigma(k)/4 when k is not a sum of 2 squares.
 * @author Georg Fischer
 */
public class A071010 extends A022544 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma().divide(4);
  }
}
