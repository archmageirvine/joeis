package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019514 a(n) = (n!)^3 + 1.
 * @author Sean A. Irvine
 */
public class A019514 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN).multiply(mN).multiply(mN);
    }
    return mF.add(1);
  }
}

