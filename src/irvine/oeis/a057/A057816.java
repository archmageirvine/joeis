package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057816 If a(n) = 0 mod 3 then a(n+1)=a(n)/3 otherwise a(n+1)=4*a(n)+-1 where sign is chosen to give a multiple of 3.
 * @author Sean A. Irvine
 */
public class A057816 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(43);
    } else {
      final long r = mA.mod(3);
      if (r == 0) {
        mA = mA.divide(3);
      } else if (r == 1) {
        mA = mA.multiply(4).subtract(1);
      } else {
        mA = mA.multiply(4).add(1);
      }
    }
    return mA;
  }
}
