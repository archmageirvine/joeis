package irvine.oeis.a003;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003132 Sum of squares of digits of n.
 * @author Sean A. Irvine
 */
public class A003132 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.digitSumSquares(++mN));
  }
}

