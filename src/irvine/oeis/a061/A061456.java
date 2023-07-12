package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a060.A060032;

/**
 * A061456 Binary representation of a(n) corresponds to "ana"-sequence.
 * @author Sean A. Irvine
 */
public class A061456 extends A060032 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    final String t = super.next().toString();
    Z r = Z.ZERO;
    for (int k = 0; k < t.length(); ++k) {
      r = r.multiply2();
      if (t.charAt(k) == '1') {
        r = r.add(1);
      }
    }
    return r;
  }
}

