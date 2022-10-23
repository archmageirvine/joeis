package irvine.oeis.a050;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050873 Triangular array T read by rows: T(n,k) = gcd(n,k).
 * @author Sean A. Irvine
 */
public class A050873 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(LongUtils.gcd(mN, mM));
  }
}
