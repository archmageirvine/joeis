package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007305 Numerators of Farey (or Stern-Brocot) tree fractions.
 * @author Sean A. Irvine
 */
public class A007305 extends Sequence0 {

  // Stern-Brocot tree

  private Z[] mFullNum = {Z.ZERO, Z.ONE};
  private Z[] mFullDen = {Z.ONE, Z.ONE};
  private Z[] mNum = {Z.ZERO, Z.ONE};
  private Z[] mDen = {Z.ONE, Z.ONE};
  private int mM = -1;

  protected Z select(final Z num, final Z den) {
    return num;
  }

  @Override
  public Z next() {
    if (++mM == mNum.length) {
      // Compute entire next row of the tree
      final int len1 = 2 * mFullNum.length - 1;
      final Z[] fullNum = new Z[len1];
      final Z[] fullDen = new Z[len1];
      final int len2 = mFullNum.length - 1;
      mNum = new Z[len2];
      mDen = new Z[len2];
      mM = 0;
      fullNum[0] = mFullNum[0];
      fullDen[0] = mFullDen[0];
      for (int k = 0, j = 1; k < mFullNum.length - 1; ++k) {
        final Z n = mFullNum[k + 1];
        final Z d = mFullDen[k + 1];
        fullNum[j] = mFullNum[k].add(n);
        fullDen[j] = mFullDen[k].add(d);
        mNum[k] = fullNum[j];
        mDen[k] = fullDen[j];
        ++j;
        fullNum[j] = n;
        fullDen[j] = d;
        ++j;
      }
      mFullNum = fullNum;
      mFullDen = fullDen;
    }
    return select(mNum[mM], mDen[mM]);
  }
}
