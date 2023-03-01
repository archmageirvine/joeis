package irvine.oeis.a144;
// manually sigman0/sigma0 at 2023-02-28 16:08

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A144925 Number of nontrivial divisors of the n-th composite number.
 * @author Georg Fischer
 */
public class A144925 extends A002808 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0().subtract(2);
  }
}
