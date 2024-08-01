package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071606 Smallest zero-free palindromic prime of 2n + 1 digits.
 * @author Sean A. Irvine
 */
public class A071606 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.TWO;
    }
    mA = mA.multiply(10).add(1);
    Z a = mA;
    String t = mA.toString();
    String r = mA.toString();
    while (true) {
      for (int d = 1; d < 10; ++d) {
        final Z v = new Z(t + d + r);
        if (v.isProbablePrime()) {
          return v;
        }
      }
      do {
        a = a.add(1);
        t = a.toString();
      } while (t.contains("0"));
      r = Functions.REVERSE.z(a).toString();
    }
  }
}
