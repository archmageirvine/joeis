package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082886 floor((prime(n+1)-prime(n))/log(prime(n))).
 * @author Sean A. Irvine
 */
public class A082886 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return CR.valueOf(mPrime.nextPrime(p).subtract(p)).divide(CR.valueOf(p).log()).floor();
  }
}
