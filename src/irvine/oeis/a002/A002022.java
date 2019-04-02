package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002022 Pile of coconuts problem.
 * @author Sean A. Irvine
 */
public class A002022 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    return (++mN & 1) == 0
      ? Z.valueOf(mN - 1).pow(mN + 1).subtract(mN - 1)
      : Z.valueOf(mN - 1).pow(mN).subtract(mN - 1);
  }
}
