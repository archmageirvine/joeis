package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059920 If m/n = q + r/n (r &lt; n, n,m &gt;=1), then array a(m,n) = qr (meaning q followed by r). Read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A059920 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return new Z(String.valueOf(n / m) + n % m);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM);
  }
}
