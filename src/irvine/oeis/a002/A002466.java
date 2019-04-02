package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002466 A jumping problem.
 * @author Sean A. Irvine
 */
public class A002466 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private Z mC = Z.TWO;

  @Override
  public Z next() {
    ++mN;
    if (mN <= 2) {
      return Z.ONE;
    } else if (mN > 3) {
      final Z t;
      switch ((int) (mN % 5)) {
        case 2:
          t = mC.add(mA);
          break;
        case 3:
          t = mC.add(mB);
          break;
        default:
          t = mC.add(mB).add(mA);
          break;
      }
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}
