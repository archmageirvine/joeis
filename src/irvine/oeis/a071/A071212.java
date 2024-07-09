package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A071212 Number of labeled cyclic trees with n nodes such that the root is smaller than all its children.
 * @author Sean A. Irvine
 */
public class A071212 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    final Z nf = Functions.FACTORIAL.z(++mN);
    final Z nf2 = Functions.FACTORIAL.z(mN - 2);
    return Integers.SINGLETON.sum(0, mN, k -> nf.divide(Functions.FACTORIAL.z(mN - k)).multiply(Functions.STIRLING1.z(mN - 1, k).abs()))
      .subtract(Integers.SINGLETON.sum(0, mN - 1, k -> nf2.divide(Functions.FACTORIAL.z(mN - 1 - k)).multiply(Functions.STIRLING1.z(mN, k).abs())));
  }
}

