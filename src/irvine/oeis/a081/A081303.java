package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.oeis.LambdaSequence;

/**
 * A081303 a(n) = gpf(n) - 2*lpf(n), where gpf(n) is the greatest and lpf(n) is the least prime factor of n (A006530, A020639).
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
