package irvine.oeis.a242;
// manually sigman0/sigma0 at 2023-02-28 21:57

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001110;

/**
 * A242585 Number of divisors of the n-th positive number that is both triangular and square.
 * @author Georg Fischer
 */
public class A242585 extends A001110 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
