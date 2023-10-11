package irvine.oeis.a067;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067138 OR-numbral multiplication table, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A067138 extends Sequence1 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(LongUtils.numbralMultiply(mN - mM, mM));
  }
}
