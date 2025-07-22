package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074152 Least power of 3 &gt; 3^n with initial digits matching the digits of 3^n.
 * @author Sean A. Irvine
 */
public class A074152 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    Z t = Z.THREE.pow(++mN);
    final String s = t.toString();
    while (true) {
      t = t.multiply(3);
      if (t.toString().startsWith(s)) {
        return t;
      }
    }
  }
}
