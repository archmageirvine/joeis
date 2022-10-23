package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048154 Triangular array T read by rows: T(n,k)=k^3 mod n, for k=1,2,...,n, n=1,2,...
 * @author Sean A. Irvine
 */
public class A048154 extends Sequence1 {

  private Z mN = Z.ZERO;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    mM = mM.add(1);
    if (mM.compareTo(mN) > 0) {
      mN = mN.add(1);
      mM = Z.ONE;
    }
    return mM.modPow(Z.THREE, mN);
  }
}

