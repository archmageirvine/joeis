package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A036461 Number of 1 digits in base 3 representation of 2^n.
 * @author Sean A. Irvine
 */
public class A036461 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitCounts(Z.ONE.shiftLeft(++mN), 3)[1]);
  }
}

