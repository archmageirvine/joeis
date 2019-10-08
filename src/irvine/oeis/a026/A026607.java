package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026607 Delete all <code>2</code>'s from <code>A026600</code> and then replace each 3 with 2.
 * @author Sean A. Irvine
 */
public class A026607 extends A026600 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.TWO.equals(t)) {
        return Z.ONE.add(t.divide2());
      }
    }
  }
}
