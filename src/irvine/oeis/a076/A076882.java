package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000720;

/**
 * A076882 pi(n) - ceiling(n / log(n)), where pi(n) = the number of primes &lt;= n.
 * @author Sean A. Irvine
 */
public class A076882 extends Sequence2 {

  private final Sequence mPi = new A000720().skip();
  private long mN = 1;

  @Override
  public Z next() {
    final CR z = CR.valueOf(++mN);
    return mPi.next().subtract(z.divide(z.log()).ceil());
  }
}
