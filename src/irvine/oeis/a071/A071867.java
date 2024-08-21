package irvine.oeis.a071;

import irvine.math.ContinuedFractionUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071866 Number of elements in the continued fraction for prime(n+1)/prime(n).
 * @author Sean A. Irvine
 */
public class A071867 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Functions.MAX.z(ContinuedFractionUtils.continuedFraction(new Q(mPrime.nextPrime(p), p)));
  }
}
