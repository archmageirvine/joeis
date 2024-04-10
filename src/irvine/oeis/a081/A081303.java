package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.oeis.LambdaSequence;

/**
 * A081303 gpf(m) - 2*spf(m), where gpf(m) is the greatest and spf(m) is the smallest prime factor of m (A006530, A020639).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A081303 extends LambdaSequence {

  /** Construct the sequence. */
  public A081303() {
    super(1, m -> {
      final FactorSequence fs = Jaguar.factor(m);
      return fs.largestPrimeFactor().subtract(fs.leastPrimeFactor().multiply(2));
    });
  }
}
