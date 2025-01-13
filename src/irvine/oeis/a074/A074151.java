package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074151 Powers of 2 &gt; 2^n with initial digits those of 2^n.
 * @author Sean A. Irvine
 */
public class A074151 extends Sequence1 {

  private int mN = 0;

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
