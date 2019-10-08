package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026605 <code>[3-&gt;null]-transform</code> of <code>three-symbol Thue-Morse A026600</code>.
 * @author Sean A. Irvine
 */
public class A026605 extends A026600 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.THREE.equals(t)) {
        return t;
      }
    }
  }
}
