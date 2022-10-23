package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048151 Triangular array T read by rows: T(n,k)=k mod n, for k=1,2,...,n, n=1,2,...
 * @author Sean A. Irvine
 */
public class A048151 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mM);
  }
}

