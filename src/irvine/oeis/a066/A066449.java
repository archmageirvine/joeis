package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066449 Binomial(n, phi(n)), where phi(n) is the Euler totient function.
 * @author Sean A. Irvine
 */
public class A066449 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, Functions.PHI.l(mN));
  }
}
