package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080613 Minimal sequence such that Omega(a(m))&lt;=Omega(a(n)) for m&lt;n, where Omega=A001222 (sum of exponents in prime factorization).
 * @author Sean A. Irvine
 */
public class A080613 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      final long oA = Functions.BIG_OMEGA.l(mA);
      final long oN = Functions.BIG_OMEGA.l(mN);
      mA = oN < oA ? Functions.LPF.z(mN).pow(oA - oN).multiply(mN) : Z.valueOf(mN);
    }
    return mA;
  }
}

