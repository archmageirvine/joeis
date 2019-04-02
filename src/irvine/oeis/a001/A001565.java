package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001565 3rd differences of factorial numbers.
 * @author Sean A. Irvine
 */
public class A001565 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Z m = Z.valueOf(mN).add(3).multiply(mN).add(5).multiply(mN).add(2);
    return mF.multiply(m);
  }
}
