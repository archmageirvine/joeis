package irvine.oeis.a055;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055778 Number of 1's in the base-phi representation of n.
 * @author Sean A. Irvine
 */
public class A055778 implements Sequence {

  private static final int ACCURACY = -100;
  private static final CR LOG_PHI_INV = CR.PHI.log().inverse();
  private long mN = -1;

  private CR logPhi(final CR x) {
    return x.log().multiply(LOG_PHI_INV);
  }

  @Override
  public Z next() {
    CR rem = CR.valueOf(++mN);
    long count = 0;
    while (rem.signum(ACCURACY) > 0) {
      rem = rem.subtract(CR.PHI.pow(logPhi(rem).floor().longValueExact()));
      ++count;
    }
    return Z.valueOf(count);
  }
}
