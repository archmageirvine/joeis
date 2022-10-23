package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008620 Positive integers repeated three times.
 * @author Sean A. Irvine
 */
public class A008620 extends Sequence0 {

  private Z mN = Z.ZERO;
  private int mM = 2;

  @Override
  public Z next() {
    if (++mM == 3) {
      mN = mN.add(1);
      mM = 0;
    }
    return mN;
  }
}
