package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a005.A005117;

/**
 * A077619 Number of occurrences of n-th squarefree number in A076734.
 * @author Sean A. Irvine
 */
public class A077619 extends A005117 {

  private final DirectSequence mA = new A077618();

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}
