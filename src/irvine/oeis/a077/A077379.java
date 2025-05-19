package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077379 Smallest n-digit squarefree number whose internal as well as external digits form a squarefree number greater than 1; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A077379 extends Sequence1 {

  private long mN = -1;

  private boolean is(final Z n) {
    return !n.isOne() && Predicates.SQUARE_FREE.is(n);
  }

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ZERO;
    }
    Z k = Z.TEN.pow(mN);
    while (true) {
      k = k.add(1);
      if (Predicates.SQUARE_FREE.is(k)) {
        final String t = k.toString();
        if (Predicates.SQUARE_FREE.is((t.charAt(0) - '0') * 10 + t.charAt(t.length() - 1) - '0') && is(new Z(t.substring(1, t.length() - 1)))) {
          return k;
        }
      }
    }
  }
}
