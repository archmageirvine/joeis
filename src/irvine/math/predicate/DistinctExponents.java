package irvine.math.predicate;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Test if a number has distinct exponents in its prime factorization
 * @author Sean A. Irvine
 */
public class DistinctExponents extends AbstractPredicate {

  @Override
  public boolean is(final Z n) {
    final HashSet<Integer> seen = new HashSet<>();
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      if (!seen.add(fs.getExponent(p))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean is(final long n) {
    return is(Z.valueOf(n));
  }
}
