package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039925 Random digits.
 * @author Sean A. Irvine
 */
public class A039925 extends A039926 {

  @Override
  public Z next() {
    final Z a = super.next();
    return a == null ? null : a.multiply(10).add(super.next());
  }
}
