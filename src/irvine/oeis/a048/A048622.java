package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048622 Difference of maximal and central values of A001222 when applied to {C(n,k)} set.
 * @author Sean A. Irvine
 */
public class A048622 extends A048620 {

  private final Sequence mA = new A048621();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}

