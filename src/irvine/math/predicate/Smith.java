package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is a Smith number.
 * @author Sean A. Irvine
 */
class Smith extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    if (n.isProbablePrime()) {
      return false;
    }
    final long d = Functions.DIGIT_SUM.l(n);
    final FactorSequence fs = Jaguar.factor(n);
    long s = 0;
    for (final Z p : fs.toZArray()) {
      s += Functions.DIGIT_SUM.l(p) * fs.getExponent(p);
      if (s > d) {
        break;
      }
    }
    return s == d;
  }
}
