package irvine.oeis.a012;

import irvine.math.z.Z;

/**
 * A012265 <code>x - x^3/3! + x^5/5! -</code> ... <code>+ (-1)^n*x^(2n+1)/(2n+1)!</code> has <code>2a(n)+1</code> real roots.
 * @author Sean A. Irvine
 */
public class A012265 extends A012264 {

  @Override
  public Z next() {
    return super.next().subtract(1).divide2();
  }
}
