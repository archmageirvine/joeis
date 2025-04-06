package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076474.
 * @author Sean A. Irvine
 */
public class A076482 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mM)).multiply(Z.valueOf(mM - 1).pow(mM));
  }
}
