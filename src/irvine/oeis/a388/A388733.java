package irvine.oeis.a388;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060010.
 * @author Sean A. Irvine
 */
public class A388733 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final Z f = Functions.FACTORIAL.z(mN);
    return Integers.SINGLETON.sum(mM, mN, f::divide);
  }
}
