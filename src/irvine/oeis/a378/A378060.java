package irvine.oeis.a378;
// Generated by gen_seq4.pl 2024-12-20.ack/lambdan at 2024-12-20 14:00

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A378060 a(n) = binomial(n, floor((n-1)/2))^2.
 * @author Georg Fischer
 */
public class A378060 extends LambdaSequence {

  /** Construct the sequence. */
  public A378060() {
    super(0, n -> (n == 0) ? Z.ZERO : Binomial.binomial(n, (n - 1) / 2).square());
  }
}
