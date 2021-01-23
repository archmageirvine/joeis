package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a005.A005179;

/**
 * A038549 Least number with exactly n divisors that are at most its square root.
 * @author Sean A. Irvine
 */
public class A038549 extends A005179 {

  @Override
  public Z next() {
    return super.next().min(super.next());
  }
}
