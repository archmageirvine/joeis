package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077402 Reverse and Add! carried out in base 3; number of steps needed to reach a palindrome, or -1 if no palindrome is ever reached.
 * @author Sean A. Irvine
 */
public class A077402 extends Sequence0 {

  private static final long HEURISTIC_LIMIT = 1000;
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 0;
    Z m = mN;
    while (!Predicates.PALINDROME.is(3, m)) {
      m = m.add(Functions.REVERSE.z(3, m));
      if (++c > HEURISTIC_LIMIT) {
        return Z.NEG_ONE;
      }
    }
    return Z.valueOf(c);
  }
}
