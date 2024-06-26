package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-05-11/lambdan at 2024-05-11 21:20

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A372671 a(n) = phi(6 * n)/2.
 * @author Georg Fischer
 */
public class A372671 extends LambdaSequence {

  /** Construct the sequence. */
  public A372671() {
    super(1, n -> Functions.PHI.z(n * 12).divide(4));
  }
}
