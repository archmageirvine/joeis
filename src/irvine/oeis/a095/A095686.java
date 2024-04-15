package irvine.oeis.a095;
// manually sigman0/sigma0 at 2023-02-28 19:27

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;

/**
 * A095686 Half the number of divisors of nonsquares (A000037).
 * @author Georg Fischer
 */
public class A095686 extends A000037 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next()).divide2();
  }
}
