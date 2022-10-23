package irvine.oeis.a055;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055378 Table read by antidiagonals: T(n,k) = n^trinv(k)+n^(k-((trinv(k)*(trinv(k)-1))/2)) where trinv (k) = floor((1+sqrt(1+8*k))/2) and with 0^0 = 1.
 * @author Sean A. Irvine
 */
public class A055378 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private long t(final long k) {
    return CR.valueOf(1 + 8 * k).sqrt().add(CR.ONE).divide(CR.TWO).floor().longValueExact();
  }

  private Z t(final long n, final long k) {
    final long tk = t(k);
    final Z zn = Z.valueOf(n);
    return zn.pow(tk - 1).add(zn.pow(k - tk * (tk - 1) / 2));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
