package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070885 a(n) = (3/2)*a(n-1) if a(n-1) is even; (3/2)*(a(n-1)+1) if a(n-1) is odd.
 * @author Sean A. Irvine
 */
public class A070885 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (mA.isEven()) {
      mA = mA.shiftRight(1).multiply(3);
    } else {
      mA = mA.add(1).shiftRight(1).multiply(3);
    }
    return mA;
  }
}
