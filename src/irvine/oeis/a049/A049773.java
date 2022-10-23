package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049773 Triangular array T read by rows: if row n is r(1),...,r(m), then row n+1 is 2r(1)-1,...,2r(m)-1,2r(1),...,2r(m).
 * @author Sean A. Irvine
 */
public class A049773 extends Sequence1 {

  private Z[] mA = {};
  protected int mN = 0;

  @Override
  public Z next() {
    if (++mN >= mA.length) {
      if (mA.length == 0) {
        mA = new Z[] {Z.ONE};
      } else {
        final Z[] t = new Z[mA.length * 2];
        for (int k = 0; k < mA.length; ++k) {
          t[k] = mA[k].multiply2().subtract(1);
          t[k + mA.length] = mA[k].multiply2();
        }
        mA = t;
      }
      mN = 0;
    }
    return mA[mN];
  }
}
