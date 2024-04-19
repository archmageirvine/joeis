package irvine.math.polynomial;

import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Redfield multiplication operation.
 * @author Sean A. Irvine
 */
public final class RedfieldMultiply implements MultivariateMonomialOperation {

  /** Redfield multiplication operation. */
  public static final RedfieldMultiply OP = new RedfieldMultiply();

  private RedfieldMultiply() { }

  @Override
  public MultivariateMonomial op(final MultivariateMonomial alpha, final MultivariateMonomial beta) {
    if (alpha.size() != beta.size()) {
      // at the very least sizes must be same
      return MultivariateMonomial.ZERO;
    }
    final MultivariateMonomial res = new MultivariateMonomial();
    for (final Map.Entry<Pair<String, Integer>, Z> a : alpha.entrySet()) {
      final Pair<String, Integer> key = a.getKey();
      final Z j = beta.get(key);
      if (!j.equals(a.getValue())) {
        return MultivariateMonomial.ZERO; // if jk != ik we bail with a zero result
      } else {
        final int k = key.right();
        //final Z ik = a.getValue(); // same as jk
        final int jk = j.intValueExact();
        res.add(k, jk);
        res.multiply(Functions.FACTORIAL.z(jk).multiply(Z.valueOf(k).pow(jk)));
      }
    }
    res.multiply(alpha.getCoefficient().multiply(beta.getCoefficient()));
    return res;
  }

}
