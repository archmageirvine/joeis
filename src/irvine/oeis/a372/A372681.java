package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-05-11/lambdan at 2024-05-11 21:20

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A372681 a(n) = phi(17 * n)/16.
 * @author Georg Fischer
 */
public class A372681 extends LambdaSequence {

  /** Construct the sequence. */
  public A372681() {
    super(1, n -> Functions.PHI.z(n * 17).divide(16));
  }
}
