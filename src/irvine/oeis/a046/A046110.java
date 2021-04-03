package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046110.
 * @author Sean A. Irvine
 */
public class A046110 extends A046080 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    return t.multiply(4).add(2);
  }
}
