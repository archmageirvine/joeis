package irvine.math.polynomial;

import java.util.Map;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Harary multiplication operation.
 * @author Sean A. Irvine
 */
public final class HararyMultiply implements MultivariateMonomialOperation {

  /** Harary multiplication operation. */
  public static final HararyMultiply OP = new HararyMultiply();

  private HararyMultiply() { }

  @Override
  public MultivariateMonomial op(final MultivariateMonomial alpha, final MultivariateMonomial beta) {
    final MultivariateMonomial res;
    if (alpha.isEmpty()) {
      res = beta.copy();
    } else {
      res = new MultivariateMonomial();
      for (final Map.Entry<Pair<String, Integer>, Z> a : alpha.entrySet()) {
        final int s = a.getKey().right();
        final Z ds = a.getValue();
        if (ds.signum() != 0) {
          for (final Map.Entry<Pair<String, Integer>, Z> b : beta.entrySet()) {
            final int u = b.getKey().right();
            final Z du = b.getValue();
            if (du.signum() != 0) {
              res.add(IntegerUtils.lcm(s, u), ds.multiply(du).multiply(IntegerUtils.gcd(s, u)));
            }
          }
        }
      }
    }
    res.setCoefficient(alpha.getCoefficient().multiply(beta.getCoefficient()));
    return res;
  }

}
