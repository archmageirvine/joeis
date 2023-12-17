package irvine.oeis.a067;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067229.
 * @author Sean A. Irvine
 */
public class A067398 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.numbralMultiply(++mN, mN));
  }
}
