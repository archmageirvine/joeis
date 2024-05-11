package irvine.oeis.a016;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016016 Number of iterations of Reverse and Add which lead to a palindrome, or -1 if no palindrome is ever reached.
 * @author Sean A. Irvine
 */
public class A016016 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z a = Z.valueOf(++mN);
    long k = 0;
    while (true) {
      ++k;
      a = Functions.REVERSE.z(a).add(a);
      if (Predicates.PALINDROME.is(a)) {
        return Z.valueOf(k);
      }
    }
  }
}
