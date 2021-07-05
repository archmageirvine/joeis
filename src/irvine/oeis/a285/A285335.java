package irvine.oeis.a285;
// manually (bisect) 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a048.A048675;

/**
 * A285335 Odd bisection of A048675 divided by two: a(n) = A048675((2*n)-1)/2.
 * @author Georg Fischer
 */
public class A285335 extends A048675 {
  
  @Override
  public Z next() {
    final Z result = super.next().divide2();
    super.next();
    return result;
  }
}
