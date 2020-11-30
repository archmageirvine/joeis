package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a033.A033950;

/**
 * A036899 Products of pairs of consecutive refactorable numbers.
 * @author Sean A. Irvine
 */
public class A036899 extends A033950 {

  private Z mA = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.subtract(1).equals(mA)) {
        final Z r = mA;
        mA = n;
        return r.multiply(n);
      }
      mA = n;
    }
  }
}
