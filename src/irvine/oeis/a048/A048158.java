package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048158 Triangular array T read by rows: T(n,k) = n mod k, for k=1,2,...,n, n=1,2,...
 * @author Sean A. Irvine
 */
public class A048158 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mN % mM);
  }
}

