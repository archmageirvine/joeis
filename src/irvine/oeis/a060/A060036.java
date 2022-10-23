package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A060036 Triangular array T read by rows: T(n,k) = k^2 mod n, for k = 1,2,...,n-1, n = 2,3,...
 * @author Sean A. Irvine
 */
public class A060036 extends Sequence2 {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mM * mM % mN);
  }
}
