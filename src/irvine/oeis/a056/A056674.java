package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a034.A034444;

/**
 * A056674 Number of squarefree divisors which are not unitary. Also number of unitary divisors which are not squarefree.
 * @author Sean A. Irvine
 */
public class A056674 extends A034444 {

  private final Sequence mA = new A056671();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
