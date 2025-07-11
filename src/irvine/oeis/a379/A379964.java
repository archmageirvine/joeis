package irvine.oeis.a379;
// Generated by gen_seq4.pl 2025-06-16.ack/lambdan at 2025-06-16 21:55

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a359.A359550;

/**
 * A379964 a(n) = 1 if (n^2)-1 is not divisible by p^p for any prime p, otherwise 0.
 * @author Georg Fischer
 */
public class A379964 extends LambdaSequence {

  private static final DirectSequence A359550 = new A359550();

  /** Construct the sequence. */
  public A379964() {
    super(1, n -> A359550.a((Z.valueOf(n).square()).subtract(1)));
  }
}
