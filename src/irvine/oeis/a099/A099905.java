package irvine.oeis.a099;
// Generated by gen_seq4.pl 2024-06-24/lambdan at 2024-06-24 23:40

import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A099905 a(n) = binomial(2n-1, n-1) mod n.
 * @author Georg Fischer
 */
public class A099905 extends LambdaSequence {

  /** Construct the sequence. */
  public A099905() {
    super(1, n -> Binomial.binomial(2L * n - 1, n - 1).modZ(n));
  }
}
