package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076086 a(1) = 1; a(n) is the smallest multiple of a(n-1) not divisible by 10 which is greater than the digit reversal of a(n-1). In case R(a(n-1)) &lt; a(n-1) then a(n) = 2*a(n-1).
 * @author Sean A. Irvine
 */
public class A076086 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      Z r = Functions.REVERSE.z(mA);
      if (r.compareTo(mA) <= 0) {
        mA = mA.multiply2();
      } else {
        r = r.add(mA.subtract(1)).divide(mA).multiply(mA);
        if (r.mod(10) == 0) {
          r = r.add(mA);
        }
        mA = r;
      }
    }
    return mA;
  }
}
