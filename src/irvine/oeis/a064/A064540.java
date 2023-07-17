package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064540 Leading digits in A064541.
 * @author Sean A. Irvine
 */
public class A064540 extends A064541 {

  @Override
  public Z next() {
    Z t = super.next();
    while (t.compareTo(Z.TEN) >= 0) {
      t = t.divide(10);
    }
    return t;
  }
}

