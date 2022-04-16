package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056192 a(n) = n divided by its characteristic cube divisor A056191.
 * @author Sean A. Irvine
 */
public class A056192 extends A056191 {

  @Override
  public Z next() {
    final Z t = super.next();
    return Z.valueOf(mN).divide(t);
  }
}
