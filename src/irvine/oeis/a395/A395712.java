package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395712 allocated for Bowen Dang.
 * @author Sean A. Irvine
 */
public class A395712 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, (++mN + 1) / 2, k -> Functions.FACTORIAL.z(k).multiply(Functions.STIRLING2.z(mN - k + 1, k)).shiftLeft(mN - 2 * k + 1));
  }
}

