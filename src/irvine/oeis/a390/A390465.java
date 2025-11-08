package irvine.oeis.a390;

import irvine.math.z.Z;

/**
 * A390332 a(n) = Sum_{k=0..n} binomial(5*n+k,n-k).
 * @author Sean A. Irvine
 */
public class A390465 extends A390148 {

  @Override
  public Z next() {
    super.next();
    super.next();
    super.next();
    return super.next();
  }
}
