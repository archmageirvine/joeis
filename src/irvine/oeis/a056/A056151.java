package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056151 Distribution of maximum inversion table entry.
 * @author Sean A. Irvine
 */
public class A056151 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(mM).pow(mN - mM).multiply(Functions.FACTORIAL.z(mM))
      .subtract(Z.valueOf(mM - 1).pow(mN - mM + 1).multiply(Functions.FACTORIAL.z(mM - 1)));
  }
}

