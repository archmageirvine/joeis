package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A062956 a(n) = h(n^2) - h(n), where h(n) is the half-totient function (A023022).
 * @author Sean A. Irvine
 */
public class A062956 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    final long n = ++mN * mN;
    return Functions.PHI.z(n).subtract(Functions.PHI.z(mN)).divide2();
  }
}

