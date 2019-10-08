package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026606 <code>[1-&gt;null]-transform</code> of <code>three-symbol Thue-Morse A026600</code>, with 1 subtracted.
 * @author Sean A. Irvine
 */
public class A026606 extends A026600 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.ONE.equals(t)) {
        return t.subtract(1);
      }
    }
  }
}
