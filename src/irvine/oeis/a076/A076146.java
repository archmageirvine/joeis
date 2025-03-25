package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076146 a(1) = 1; a(n) = a(n-1)*prime(a(n-1)).
 * @author Sean A. Irvine
 */
public class A076146 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(Functions.PRIME.z(mA));
    return mA;
  }
}
