package irvine.oeis.a365;

import java.util.HashMap;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A365521 allocated for Jianglin Luo.
 * @author Sean A. Irvine
 */
public class A365521 extends Sequence1 {

  private final HashMap<Z, Long> mPreviousLocation = new HashMap<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z res = null;
    long earliest = mN;
    for (final Z p : Jaguar.factor(mN).toZArray()) {
      final Long loc = mPreviousLocation.get(p);
      if (loc == null) {
        res = p;
        break;
      }
      if (loc < earliest) {
        res = p;
        earliest = loc;
      }
    }
    mPreviousLocation.put(res, mN);
    return res;
  }
}
