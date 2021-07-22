package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049207 Array T(m,n) of products of pronic numbers m(m+1) * n(n+1) read by antidiagonals ("bipronics").
 * @author Sean A. Irvine
 */
public class A049207 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Z.valueOf(n).multiply(n + 1).multiply(m).multiply(m + 1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
