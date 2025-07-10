package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078671.
 * @author Sean A. Irvine
 */
public class A078673 extends A078628 {

  @Override
  public Z next() {
    final Z t = super.next();
    return t.isOne() ? t : t.divide2();
  }
}
