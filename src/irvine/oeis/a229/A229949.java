package irvine.oeis.a229;
// manually sigman0/sigma0 at 2023-02-28 16:08

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002620;

/**
 * A229949 Number of divisors of the n-th positive quarter-square.
 * @author Georg Fischer
 */
public class A229949 extends A002620 {

  {
    setOffset(1);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
