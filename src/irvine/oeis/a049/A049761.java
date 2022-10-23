package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049761 Triangular array T, read by rows: T(n,k) = n^3 mod k, for k = 1..n and n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A049761 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;

  protected Z power() {
    return Z.THREE;
  }

  protected Z t(final long n, final long m) {
    return Z.valueOf(n).modPow(power(), Z.valueOf(m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
