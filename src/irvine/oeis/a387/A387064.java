package irvine.oeis.a387;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A387064 Total number of entries in rows 0 to n of Pascal's triangle multiple of n.
 * @author Sean A. Irvine
 */
public class A387064 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    long cnt = 0;
    for (int r = 0; r <= mN; ++r) {
      for (int k = 0; k <= r; ++k) {
        if (Binomial.binomial(r, k).mod(mN) == 0) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
