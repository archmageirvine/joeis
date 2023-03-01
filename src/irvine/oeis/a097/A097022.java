package irvine.oeis.a097;
// manually sigman1/sigma1 at 2023-02-28 22:58

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001105;

/**
 * A097022 a(n) = (sigma(2n^2)-3)/6.
 * @author Georg Fischer
 */
public class A097022 extends A001105 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma().subtract(3).divide(6);
  }
}
