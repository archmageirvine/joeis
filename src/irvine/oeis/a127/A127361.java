package irvine.oeis.a127;
// manually unsigned at 2021-11-01 18:36

import irvine.math.z.Z;
import irvine.oeis.a100.A100098;

/**
 * A127361 a(n) = Sum_{k=0..n} binomial(n, floor(k/2))*(-2)^(n-k).
 * @author Georg Fischer
 */
public class A127361 extends A100098 {

  protected int mN = -1;
  
  @Override
  public Z next() {
    return (++mN & 1) == 0 ? super.next() : super.next().negate();
  }
}
