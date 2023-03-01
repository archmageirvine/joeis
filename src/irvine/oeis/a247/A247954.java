package irvine.oeis.a247;
// manually sigman1/sigma1 at 2023-02-28 22:58

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a008.A008438;

/**
 * A247954 a(n) = sigma(sigma(2n-1)).
 * @author Georg Fischer
 */
public class A247954 extends A008438 {

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma();
  }
}
