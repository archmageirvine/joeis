package irvine.oeis.a104;
// manually sigman1/sigma1s at 2023-02-28 23:52

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A104353 Sum of divisors of A104350(n).
 * @author Georg Fischer
 */
public class A104353 extends A104350 {

  @Override
  public Z next() {
    return Functions.SIGMA1.z(super.next());
  }
}
