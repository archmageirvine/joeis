package irvine.math.predicate;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * Test if a number is an Achilles number (see A052486): powerful but imperfect.
 * @author Georg Fischer
 */
public class Achilles extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    final Z[] f = fs.toZArray();
    int g = 1; // GCD
    for (int i = 0; i < f.length; ++i) {
      final int e = fs.getExponent(f[i]);
      if (e == 1) {
        return false;
      }
      g = i == 0 ? e : Functions.GCD.i(g, e);
    }
    return g == 1;
  }
}
