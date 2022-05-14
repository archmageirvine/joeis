package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056895 If the smallest prime with a square excess of n is p then a(n)^2 = p - n.
 * @author Sean A. Irvine
 */
public class A056895 extends A056894 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
