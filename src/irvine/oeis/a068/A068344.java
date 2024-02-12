package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068344 Square array read by antidiagonals of T(n,k) = sign(n-k).
 * @author Sean A. Irvine
 */
public class A068344 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final long a = mN - mM;
    return a == mM ? Z.ZERO : a < mM ? Z.ONE : Z.NEG_ONE;
  }
}

