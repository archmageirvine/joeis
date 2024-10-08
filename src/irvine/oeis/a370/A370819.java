package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-09-22.ack/lambdan at 2024-09-22 22:36

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a029.A029837;

/**
 * A370819 Number of subsets of {1..n-1} whose cardinality is one less than the length of the binary expansion of n; a(0) = 0.
 * @author Georg Fischer
 */
public class A370819 extends LambdaSequence {

  private static final DirectSequence A029837 = new A029837();

  /** Construct the sequence. */
  public A370819() {
    super(0, n -> (n <= 0) ? Z.ZERO : Binomial.binomial(n - 1, A029837.a(n + 1).subtract(1)));
  }
}
