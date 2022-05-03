package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a048.A048656;

/**
 * A056675 Number of non-unitary but squarefree divisors of n!. Also number of unitary but not-squarefree divisors of n!.
 * @author Sean A. Irvine
 */
public class A056675 extends A048656 {

  private final Sequence mA = new A056672();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
