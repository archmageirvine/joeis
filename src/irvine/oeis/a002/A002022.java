package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A002022 In the pile of coconuts problem, the number of coconuts that remain to be shared equally at the end of the process.
 * @author Sean A. Irvine
 */
public class A002022 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    return (++mN & 1) == 0
      ? Z.valueOf(mN - 1).pow(mN + 1).subtract(mN - 1)
      : Z.valueOf(mN - 1).pow(mN).subtract(mN - 1);
  }
}
