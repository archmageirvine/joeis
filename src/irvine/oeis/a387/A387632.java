package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387632 allocated for Natalia L. Skirrow.
 * @author Sean A. Irvine
 */
public class A387632 extends Sequence1 {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Integers.SINGLETON.sum(mN - mM, mN - 1, j -> Functions.STIRLING2.z(j, mN - mM).multiply(Functions.FACTORIAL.z(mN - 1)).divide(Functions.FACTORIAL.z(j)))
      .multiply(Functions.FACTORIAL.z(mN)).divide(Functions.FACTORIAL.z(mM));
  }
}
