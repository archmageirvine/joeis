package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074151 Least power of 2 &gt; 2^n with initial digits matching the digits of 2^n.
 * @author Sean A. Irvine
 */
public class A074151 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    Z t = Z.ONE.shiftLeft(++mN);
    final String s = t.toString();
    while (true) {
      t = t.multiply2();
      if (t.toString().startsWith(s)) {
        return t;
      }
    }
  }
}
