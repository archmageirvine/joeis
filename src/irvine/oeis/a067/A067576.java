package irvine.oeis.a067;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A067576 Array T(i,j) read by downward antidiagonals, where T(i,j) is the j-th term whose binary expansion has i 1's.
 * @author Sean A. Irvine
 */
public class A067576 extends Sequence1 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= mA.size()) {
      final Z res = Z.ONE.shiftLeft(mN + 1).subtract(1);
      mA.add(res);
      mN = -1;
      return res;
    }
    final Z res = ZUtils.swizzle(mA.get(mN));
    mA.set(mN, res);
    return res;
  }
}
