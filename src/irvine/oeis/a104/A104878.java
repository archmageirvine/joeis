package irvine.oeis.a104;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A104878 A sum-of-powers number triangle.
 * @author Sean A. Irvine
 */
public class A104878 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  protected Z t(final int n, final int k) {
    if (k <= 1) {
      return k == 0 ? Z.ONE : Z.valueOf(n);
    }
    return Z.valueOf(k).pow(n - k + 1).subtract(1).divide(k - 1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
