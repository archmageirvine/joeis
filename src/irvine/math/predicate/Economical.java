package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Test if a number is economical.
 * @author Sean A. Irvine
 */
public class Economical extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    final int len = String.valueOf(n).length();
    int l = 0;
    for (final Z p : fs.toZArray()) {
      l += p.toString().length();
      final int e = fs.getExponent(p);
      if (e > 1) {
        l += String.valueOf(e).length();
      }
      if (l >= len) {
        break;
      }
    }
    return l < len;
  }
}
