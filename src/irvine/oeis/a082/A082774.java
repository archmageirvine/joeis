package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence3;
import irvine.oeis.a000.A000040;

/**
 * A082774 a(n) = floor(cot(2*Pi/prime(n))).
 * @author Sean A. Irvine
 */
public class A082774 extends Sequence3 {

  private final Sequence mPrimes = new A000040().skip(2);

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.cot(CR.TAU.divide(mPrimes.next())).floor();
  }
}
