package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074152 Least power of 3 &gt; 3^n with initial digits matching the digits of 3^n.
 * @author Sean A. Irvine
 */
public class A074152 extends Sequence1 {

  private int mN = 0;

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
