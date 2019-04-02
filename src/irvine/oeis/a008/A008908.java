package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a006.A006577;

/**
 * A008908 (1 + number of halving and tripling steps to reach 1 in the Collatz (3x+1) problem), or -1 if 1 is never reached.
 * @author Sean A. Irvine
 */
public class A008908 extends A006577 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
