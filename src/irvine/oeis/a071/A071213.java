package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A071213 Number of labeled planar trees with n nodes such that the root is smaller than all its children.
 * @author Sean A. Irvine
 */
public class A071213 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN - 2, k -> Functions.FACTORIAL.z(mN - 2 + k).multiply(mN - 1).divide(Functions.FACTORIAL.z(k)).divide(mN - 1 - k))
      .multiply2()
      .subtract(Functions.FACTORIAL.z(2 * mN - 3).divide(Functions.FACTORIAL.z(mN - 2)));
  }
}
