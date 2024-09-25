package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072339.
 * @author Sean A. Irvine
 */
public class A072343 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Functions.FACTORIAL.z(mN + k).divide(Functions.FACTORIAL.z(k).square())).shiftLeft(mN - 1);
  }
}
