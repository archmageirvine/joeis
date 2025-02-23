package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-01-31.ack/lambdan at 2025-01-31 23:19

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A378993 a(n) = n - omega(n), where omega = A001221.
 * @author Georg Fischer
 */
public class A378993 extends LambdaSequence {

  /** Construct the sequence. */
  public A378993() {
    super(1, n -> Z.valueOf(n).subtract(Functions.OMEGA.z(n)));
  }
}
