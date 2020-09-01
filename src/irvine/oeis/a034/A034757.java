package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a005.A005282;

/**
 * A034757 a(1)=1, a(n) = smallest odd number such that all sums of pairs of (not necessarily distinct) terms in the sequence are distinct.
 * @author Sean A. Irvine
 */
public class A034757 extends A005282 {

  @Override
  public Z next() {
    return super.next().multiply2().subtract(1);
  }
}
