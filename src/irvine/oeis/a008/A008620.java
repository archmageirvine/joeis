package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008620.
 * @author Sean A. Irvine
 */
public class A008620 implements Sequence {

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
