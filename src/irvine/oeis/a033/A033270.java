package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A033270 Number of odd primes &lt;= n.
 * @author Sean A. Irvine
 */
public class A033270 extends A000720 {

  @Override
  public Z next() {
    return Z.ZERO.max(super.next().subtract(1));
  }
}

