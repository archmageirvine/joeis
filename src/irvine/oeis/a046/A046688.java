package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046688 Antidiagonals of square array in which k-th row (k&gt;0) is an arithmetic progression of difference 2^(k-1).
 * @author Sean A. Irvine
 */
public class A046688 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return m <= 0 ? Z.ONE : Z.valueOf(n).shiftLeft(m - 1).add(1);
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
