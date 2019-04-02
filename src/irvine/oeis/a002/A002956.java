package irvine.oeis.a002;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.a082.A082641;

/**
 * A002956 Number of basic invariants for cyclic group of order and degree n.
 * @author Sean A. Irvine
 */
public class A002956 extends A082641 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(IntegerUtils.sum(A082641.count(++mN)));
  }
}
