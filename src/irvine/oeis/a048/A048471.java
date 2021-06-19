package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048471 Array T read by diagonals: T(k,n) = 2^(k-1) * (3^n - 1) + 1.
 * @author Sean A. Irvine
 */
public class A048471 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return Z.THREE.pow(n).subtract(1).shiftLeft(m - 1).add(1);
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
