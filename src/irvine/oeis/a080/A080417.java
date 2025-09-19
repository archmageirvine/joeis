package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080417 Signed Stirling numbers of the second kind.
 * @author Sean A. Irvine
 */
public class A080417 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Functions.STIRLING2.z(mN, mM).multiply(Z.NEG_ONE.pow(mM + 1));
  }
}

