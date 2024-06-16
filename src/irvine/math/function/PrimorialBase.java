package irvine.math.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;

/**
 * Expand the number into a primorial base representation.
 * @author Sean A. Irvine
 */
class PrimorialBase extends AbstractFunction1 {

  private static List<Z> primorialBaseList(final Z n) {
    int b = 0;
    while (Functions.PRIMORIAL_COUNT.z(b).compareTo(n) <= 0) {
      ++b;
    }
    if (b == 0) {
      return Collections.singletonList(n);
    }
    final List<Z> res = new ArrayList<>();
    Z m = n;
    do {
      final Z[] qr = m.divideAndRemainder(Functions.PRIMORIAL_COUNT.z(--b));
      res.add(qr[0]);
      m = qr[1];
    } while (b > 0);
    return res;
  }

  @Override
  public Z z(final Z n) {
    Z res = Z.ZERO;
    for (final Z t : primorialBaseList(n)) {
      if (t.compareTo(Z.TEN) >= 0) {
        throw new RuntimeException("Expansion resulted in value >= 10");
      }
      res = res.multiply(10).add(t);
    }
    return res;
  }
}
