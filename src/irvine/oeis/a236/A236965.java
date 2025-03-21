package irvine.oeis.a236;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076057.
 * @author Sean A. Irvine
 */
public class A236965 extends A000040 {

  @Override
  public Z next() {
    return Q.HALF.subtract(new Q(1, super.next().add(1))).num();
  }
}
