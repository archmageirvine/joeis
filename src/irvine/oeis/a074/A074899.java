package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074899 Triangular numbers written backwards and sorted, duplicates removed.
 * @author Sean A. Irvine
 */
public class A074899 extends Sequence1 {

  private static final int HEURISTIC = 10;
  private long mN = 0;

  private boolean is(final long n) {
    if (n % 10 == 0) {
      return false; // Cannot result from the reverse
    }
    Z r = Functions.REVERSE.z(n);
    for (int k = 0; k < HEURISTIC; ++k) {
      if (Predicates.TRIANGULAR.is(r)) {
        return true;
      }
      r = r.multiply(10);
    }
    return false;
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
