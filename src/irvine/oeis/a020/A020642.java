package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020642.
 * @author Sean A. Irvine
 */
public class A020642 implements Sequence {

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
