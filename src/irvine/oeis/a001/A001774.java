package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001774.
 * @author Sean A. Irvine
 */
public class A001774 implements Sequence {

  private Z mP = Z.valueOf(17);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      mP = mP.shiftLeft(2);
      if (mP.subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
