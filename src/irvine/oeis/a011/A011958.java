package irvine.oeis.a011;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011958 Number of CdI_2 polytypes that repeat after 2n layers.
 * @author Sean A. Irvine
 */
public class A011958 extends Sequence1 {

  // After Daniel Okwor

  private long mN = 0;

  private Z t(final long n, final long d) {
    final long m = 2 * n / d;
    return d % 3 == 0 ? Z.ONE.shiftLeft(m) : Z.ONE.shiftLeft(m).add(2).divide(3);
  }

  private Z ip(final long n) {
    return Integers.SINGLETON.sumdiv(n, d -> t(n, d).multiply(Functions.PHI.l(d)))
      .add(Z.ONE.shiftLeft(n).subtract(Z.NEG_ONE.pow(n)).multiply(2 * n).divide(3))
      .divide(2 * n);
  }

  private Z ipp(final long n) {
    if ((n & 1) == 1) {
      return Z.ZERO;
    }
    return Integers.SINGLETON.sumdiv(n / 2, d -> Functions.PHI.z(2 * d).shiftLeft(n / d))
      .divide(2 * n);
  }

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> ip(d).add(ipp(d)).divide2().multiply(Functions.MOBIUS.l(mN / d)));
  }
}
