package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a007.A007304;

/**
 * A087053 Numbers of the form pq + qr + rp where p, q and r are distinct primes, with multiplicity.
 * @author Sean A. Irvine
 */
public class A087053 extends A007304 {

  @Override
  public Z next() {
    return Functions.ARD.z(super.next());
  }
}
