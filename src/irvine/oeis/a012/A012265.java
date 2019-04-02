package irvine.oeis.a012;

import irvine.math.z.Z;

/**
 * A012265 x - x^3/3! + x^5/5! - ... + (-1)^n*x^(2n+1)/(2n+1)! has 2a(n)+1 real roots.
 * @author Sean A. Irvine
 */
public class A012265 extends A012264 {

  @Override
  public Z next() {
    return super.next().subtract(1).divide2();
  }
}
