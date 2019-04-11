package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008854 Numbers that are congruent to <code>{0, 1, 4} mod 5</code>.
 * @author Sean A. Irvine
 */
public class A008854 implements Sequence {

  private final long[] mAdd = {1, 1, 3};
  private Z mN = Z.NEG_ONE;
  private int mP = -1;

  @Override
  public Z next() {
    if (++mP >= mAdd.length) {
      mP = 0;
    }
    mN = mN.add(mAdd[mP]);
    return mN;
  }
}
