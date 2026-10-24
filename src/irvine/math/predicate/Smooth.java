package irvine.math.predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is a p-smooth (see A003586): all prime divisors are &lt;= p.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class Smooth extends AbstractPredicate2 {

  @Override
  public long getDefault() {
    return 3;
  }

  @Override
  public boolean is(final long base, final Z n) {
    if (n.isZero()) {
      return true;
    }
    if (base <= 1) {
      return n.isOne();
    }
    Z m = n.makeOdd();
    for (long p = 3; p <= base; p = Functions.NEXT_PRIME.l(p)) {
      while (true) {
        final Z[] qr = m.divideAndRemainder(p);
        if (qr[1].isZero()) {
          m = qr[0];
        } else {
          break;
        }
      }
    }
    return m.isOne();
  }

  @Override
  public boolean is(final long base, final long n) {
    return Functions.GPF.l(n) <= base;
  }
}
