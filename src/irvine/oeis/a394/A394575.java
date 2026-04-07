package irvine.oeis.a394;

import irvine.factor.util.FactorUtils;
import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A394575 Anti-admirable numbers. A number k is anti-admirable if there exists an anti-divisor d of k such that A066417(k) - 2d = 2k.
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
