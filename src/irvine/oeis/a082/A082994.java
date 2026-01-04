package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082994 Numbers k such that all the following properties hold: (i) k*reverse(k) is a square; (ii) k != reverse(k); (iii) k and reverse(k) are not both squares; and (iv) k and reverse(k) have the same number of digits.
 * @author Sean A. Irvine
 */
public class A082994 extends Sequence1 {

  private long mN = 287;

  private boolean is(final long n) {
    if (n % 10 == 0) {
      return false; // condition (iv) fails
    }
    final long r = Functions.REVERSE.l(n);
    if (r == n) {
      return false; // condition (ii) fails
    }
    if (Predicates.SQUARE.is(n) && Predicates.SQUARE.is(r)) {
      return false; // condition (iii) fails
    }
    return Predicates.SQUARE.is(Z.valueOf(n).multiply(r));
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
