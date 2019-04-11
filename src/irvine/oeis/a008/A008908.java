package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a006.A006577;

/**
 * A008908 <code>(1 +</code> number of halving and tripling steps to reach 1 in the Collatz <code>(3x+1)</code> problem), or <code>-1</code> if 1 is never reached.
 * @author Sean A. Irvine
 */
public class A008908 extends A006577 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
