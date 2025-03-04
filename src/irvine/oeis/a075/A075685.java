package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075685 Reverse and Add! carried out in base 4; number of steps needed to reach a palindrome, or -1 if no palindrome is ever reached.
 * @author Sean A. Irvine
 */
public class A075685 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 0;
    Z m = mN;
    while (!Predicates.PALINDROME.is(4, m)) {
      m = m.add(Functions.REVERSE.z(4, m));
      ++c;
    }
    return Z.valueOf(c);
  }
}
