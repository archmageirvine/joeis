package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A080153 a(1)=2, a(2)=3; a(n) for n&gt;2 is the first prime &gt; a(n-1) such that the concatenation of a(n-1), a(n-2) and a(n) is also prime.
 * @author Sean A. Irvine
 */
public class A080153 extends A000040 {

  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;

  @Override
  public Z next() {
    final String s = mA.toString() + mB;
    while (true) {
      final Z p = super.next();
      if (new Z(s + p).isProbablePrime()) {
        mA = mB;
        mB = p;
        return p;
      }
    }
  }
}
