package irvine.oeis.a052;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052037 Smallest positive number that must be added to n to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A052037 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (!Predicates.PALINDROME.is(mN + k)) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
