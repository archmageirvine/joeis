package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Test if a number is indivisible.
 * @author Sean A. Irvine
 */
public class Indivisible extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      for (final Z q : fs.toZArray()) {
        if (q.equals(p)) {
          break;
        }
        final int f = fs.getExponent(q);
        if (f > e && f % e == 0) {
          return false;
        }
        if (e > f && e % f == 0) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public boolean is(final long n) {
    return is(Z.valueOf(n));
  }
}
