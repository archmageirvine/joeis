package irvine.math.polynomial;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Pair multiply for cycle indexes.
 * @author Sean A. Irvine
 */
public final class PairMultiply implements MultivariateMonomialOperation {

  /** Pair multiply for cycle indexes. */
  public static final MultivariateMonomialOperation OP = new PairMultiply();

  private PairMultiply() { }

  @Override
  public MultivariateMonomial op(final MultivariateMonomial alpha, final MultivariateMonomial beta) {
    final MultivariateMonomial ans = new MultivariateMonomial();
    final int maxIn = alpha.maxIndex();
    for (int indet = 1; indet <= maxIn; ++indet) {
      final Pair<String, Integer> indetKey = new Pair<>(MultivariateMonomial.DEFAULT_VARIABLE, indet);
      final Z d = alpha.get(indetKey);
      if (d.signum() > 0) {
        if ((indet & 1) == 1) {
          ans.add(indet, d.multiply(indet - 1).divide2());
        } else {
          ans.add(indet, d.multiply(indet - 2).divide2());
          ans.add(indet / 2, d);
        }
        ans.add(indet, d.multiply(d.subtract(1)).divide2().multiply(indet));
      }
    }
    for (int i = 1; i < maxIn; ++i) {
      final Pair<String, Integer> iKey = new Pair<>(MultivariateMonomial.DEFAULT_VARIABLE, i);
      final Z di = alpha.get(iKey);
      if (di.signum() > 0) {
        for (int j = i + 1; j <= maxIn; ++j) {
          ans.add(IntegerUtils.lcm(i, j), di.multiply(Functions.GCD.i(i, j)).multiply(alpha.get(new Pair<>(MultivariateMonomial.DEFAULT_VARIABLE, j))));
        }
      }
    }
    ans.setCoefficient(alpha.getCoefficient().multiply(beta.getCoefficient()));
    return ans;
  }
}
