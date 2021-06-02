package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048156 Triangular array T read by rows: T(n,k)=k^4 mod n, for k=1,2,...,n, n=1,2,...
 * @author Sean A. Irvine
 */
public class A048156 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    mM = mM.add(1);
    if (mM.compareTo(mN) > 0) {
      mN = mN.add(1);
      mM = Z.ONE;
    }
    return mM.modPow(Z.FOUR, mN);
  }
}

