package irvine.oeis.a132;

import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A132788 a(n) = 2*binomial(2*n,n)/(n+1) - n.
 * @author Georg Fischer
 */
public class A132788 extends LambdaSequence {

  /** Construct the sequence. */
  public A132788() {
    super(1, n -> Binomial.binomial(2 * n, n).multiply2().divide(n + 1).subtract(n));
  }
}
