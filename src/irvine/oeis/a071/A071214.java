package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A071214 Number of labeled ordered trees with n nodes such that the root is smaller than all its children.
 * @author Sean A. Irvine
 */
public class A071214 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Functions.FACTORIAL.z(2 * mN - 2).divide(Functions.FACTORIAL.z(mN - 1))
      .subtract(Integers.SINGLETON.sum(0, mN - 2, k -> Functions.FACTORIAL.z(mN + k - 1).divide(Functions.FACTORIAL.z(k)).divide(mN - k - 1)));
  }
}
