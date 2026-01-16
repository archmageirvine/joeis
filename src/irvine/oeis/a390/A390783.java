package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083203.
 * @author Sean A. Irvine
 */
public class A390783 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private long mN = 2;

  @Override
  public Z next() {
    if (mSum.isZero()) {
      mSum = Z.ONE;
      return Z.ONE;
    }
    if (mSum.isOne()) {
      mSum = Z.THREE;
      return Z.TWO;
    }
    while (true) {
      final Z t = mSum.add(++mN);
      if (t.mod(mN - 2) == 0) {
        mSum = t;
        return Z.valueOf(mN);
      }
    }
  }
}
