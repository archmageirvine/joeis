package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A080155 a(1)=2; a(n) for n&gt;1 is the smallest prime number &gt; a(n-1) such that the concatenation of all previous terms is also prime.
 * @author Sean A. Irvine
 */
public class A080155 extends A000040 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final String s = mA.toString();
    while (true) {
      final Z p = super.next();
      final Z t = new Z(s + p);
      if (t.isProbablePrime()) {
        mA = t;
        return p;
      }
    }
  }
}
