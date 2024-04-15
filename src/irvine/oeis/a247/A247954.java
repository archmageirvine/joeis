package irvine.oeis.a247;
// manually sigman1/sigma1 at 2023-02-28 22:58

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a008.A008438;

/**
 * A247954 a(n) = sigma(sigma(2n-1)).
 * @author Georg Fischer
 */
public class A247954 extends A008438 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    return Functions.SIGMA.z(super.next());
  }
}
