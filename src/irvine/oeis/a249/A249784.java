package irvine.oeis.a249;
// manually sigman0/sigma0 at 2023-02-28 16:47

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002488;

/**
 * A249784 Number of divisors of n^(n^n).
 * @author Georg Fischer
 */
public class A249784 extends A002488 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
