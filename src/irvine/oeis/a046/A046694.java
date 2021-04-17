package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000594;

/**
 * A046694 Ramanujan tau numbers mod 691 = sum of 11th power of divisors mod 691.
 * @author Sean A. Irvine
 */
public class A046694 extends A000594 {

  private static final Z MOD = Z.valueOf(691);

  @Override
  public Z next() {
    return super.next().mod(MOD);
  }
}
