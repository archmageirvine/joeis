package irvine.oeis.a353;
// Generated by gen_seq4.pl 2024-09-29.ack/sintrif at 2024-09-29 22:15

import irvine.math.function.Functions;
import irvine.oeis.a076.A076617;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A353000 Quotients obtained when sigma(k) divides antisigma(k) with k = A076617(n), sigma (A000203) is the sum of divisors function and antisigma (A024816) is the sum of the non-divisors of n less than n function.
 * @author Georg Fischer
 */
public class A353000 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A353000() {
    super(1, (term, n) -> Functions.ANTISIGMA.z(term).divide(Functions.SIGMA1.z(term)), "", new A076617());
  }
}
