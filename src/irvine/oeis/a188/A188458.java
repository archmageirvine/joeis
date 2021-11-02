package irvine.oeis.a188;
// manually unsigned at 2021-11-01 18:36

import irvine.math.z.Z;
import irvine.oeis.a001.A001586;

/**
 * A188458 Expansion of e.g.f. exp(x)/cosh(2*x).
 * @author Georg Fischer
 */
public class A188458 extends A001586 {

  protected int mN = -1;
  
  @Override
  public Z next() {
    return (++mN & 2) == 0 ? super.next() : super.next().negate();
  }
}
