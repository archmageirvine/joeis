package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395459 allocated for Sah Deepak Kumar Sureshprasad.
 * @author Sean A. Irvine
 */
public class A395459 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    if (mN == 1) {
      return Z.ONE;
    }
    return Functions.FACTORIAL.z(mN - 2).multiply(mN + mM - 1).divide(Functions.FACTORIAL.z(mM)).multiply(Z.NEG_ONE.pow(mN + mM - 1));
  }
}

