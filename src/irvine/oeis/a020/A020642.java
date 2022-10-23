package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020642 n-th composite is sum of first k composites for some k.
 * @author Sean A. Irvine
 */
public class A020642 extends Sequence1 {

  private Z mA = Z.ZERO;
  private Z mC = Z.THREE;
  private Z mD = Z.THREE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mC = mC.add(1);
      if (mC.isProbablePrime()) {
        mC = mC.add(1);
      }
      mA = mA.add(mC);
      while (mD.compareTo(mA) < 0) {
        mD = mD.add(1);
        if (mD.isProbablePrime()) {
          mD = mD.add(1);
        }
        ++mN;
      }
      if (mD.equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}
