package irvine.oeis.a067;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067398 Squares in OR-numbral arithmetic.
 * @author Sean A. Irvine
 */
public class A067398 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.numbralMultiply(++mN, mN));
  }
}
