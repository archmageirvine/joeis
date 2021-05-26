package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047908 a(n+1) = a(n) op n, where op is successively +, *, -.
 * @author Sean A. Irvine
 */
public class A047908 implements Sequence {

  private Z mA = null;
  private long mN = 0;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      switch ((int) (++mN % 3)) {
        case 1:
          mA = mA.add(mN);
          break;
        case 2:
          mA = mA.multiply(mN);
          break;
        default:
          mA = mA.subtract(mN);
          break;
      }
    }
    return mA;
  }
}
