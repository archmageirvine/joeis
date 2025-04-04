package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A033665 Number of 'Reverse and Add' steps needed to reach a palindrome starting at n, or -1 if n never reaches a palindrome.
 * @author Sean A. Irvine
 */
public class A033665 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 0;
    Z m = mN;
    while (!Predicates.PALINDROME.is(m)) {
      m = m.add(Functions.REVERSE.z(m));
      ++c;
    }
    return Z.valueOf(c);
  }
}
