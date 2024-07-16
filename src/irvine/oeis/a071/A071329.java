package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071329 Largest prime q such that q - prime(n) &lt;= n.
 * @author Sean A. Irvine
 */
public class A071329 extends A000040 {

  private long mN = 1;

  @Override
  public Z next() {
    return mPrime.prevPrime(super.next().add(++mN));
  }
}
