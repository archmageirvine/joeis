package irvine.oeis.a394;

import irvine.factor.util.FactorUtils;
import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A394575 allocated for Paolo P. Lava.
 * @author Sean A. Irvine
 */
public class A394575 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A394575() {
    super(1, k -> {
      final long as = Functions.ANTISIGMA1.l(k);
      for (final long ad : FactorUtils.antidivisors(k)) {
        if (as - 2 * ad == 2 * k) {
          return true;
        }
      }
      return false;
    });
  }
}
