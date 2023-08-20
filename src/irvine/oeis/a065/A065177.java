package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A065177 Table M(n,b) (columns: n &gt;= 1, rows: b &gt;= 0) gives the number of site swap juggling patterns with exact period n, using exactly b balls, where cyclic shifts are not counted as distinct.
 * @author Sean A. Irvine
 */
public class A065177 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final long n, final long m) {
    return new InverseEulerTransform(new Sequence0() {
      private int mJ = -1;
      @Override
      public Z next() {
        return Z.valueOf(n).pow(++mJ);
      }
    }).skip(m).next();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM);
  }
}
