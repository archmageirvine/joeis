package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a039.A039593;

/**
 * A056676 Number of non-unitary but squarefree divisors of binomial(n,floor(n/2)). Also number of nonsquarefree but unitary divisors of binomial(n,floor(n/2)).
 * @author Sean A. Irvine
 */
public class A056676 extends A039593 {

  private final Sequence mA = new A056673();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
