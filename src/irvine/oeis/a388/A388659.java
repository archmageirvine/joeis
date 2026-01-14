package irvine.oeis.a388;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A388659 allocated for Gonzalo Mart\u00ednez.
 * @author Sean A. Irvine
 */
public class A388659 extends Sequence1 {

  private long mN = 3;

  private boolean is(final long n) {
    long s = Functions.TRIANGULAR.l(n);
    long t = 0;
    for (int k = 1; k < n; ++k) {
      t += k;
      s -= k;
      if (Predicates.SQUARE.is(t) && Predicates.SQUARE.is(s)) {
        return true;
      }
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

