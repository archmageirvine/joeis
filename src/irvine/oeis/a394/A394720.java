package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394720 allocated for Wang Yixiang.
 * @author Sean A. Irvine
 */
public class A394720 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return Z.TWO;
      }
      mB = Z.THREE;
      return Z.THREE;
    }
    final Z t = mA.add(mB);
    if (t.isProbablePrime()) {
      mA = mB;
      mB = t;
      return t;
    }
    final Z up = Functions.NEXT_PRIME.z(t);
    final Z down = Functions.PREV_PRIME.z(t);
    final Z u = t.subtract(down).compareTo(up.subtract(t)) <= 0 ? down : up;
    mA = mB;
    mB = u;
    return u;
  }
}
