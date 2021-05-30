package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a034.A034444;

/**
 * A048109 Numbers having equally many squarefree and nonsquarefree divisors; number of unitary divisors of n (A034444) = number of non-unitary divisors of n (A048105).
 * @author Sean A. Irvine
 */
public class A048109 extends A034444 {

  private final Sequence mA = new A048105();

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(mA.next())) {
        return mN;
      }
    }
  }
}
