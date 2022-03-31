package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055652 Table T(m,k)=m^k+k^m (with 0^0 taken to be 1) as square array read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A055652 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final long n = mN - mM;
    final long m = mM;
    return Z.valueOf(n).pow(m).add(Z.valueOf(m).pow(n));
  }
}
