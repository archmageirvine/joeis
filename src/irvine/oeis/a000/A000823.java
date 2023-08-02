package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000823 Number of switching networks (see Harrison reference for precise definition).
 * @author Sean A. Irvine
 */
public class A000823 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft((1L << (mN + 1)) - mN - 1).add(Z.ONE.shiftLeft(1L << mN)).subtract(Z.ONE.shiftLeft((1L << mN) - mN - 1));
  }
}

