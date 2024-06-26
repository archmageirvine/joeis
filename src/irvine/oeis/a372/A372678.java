package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-05-11/lambdan at 2024-05-11 21:20

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A372678 a(n) = phi(14 * n)/6.
 * @author Georg Fischer
 */
public class A372678 extends LambdaSequence {

  /** Construct the sequence. */
  public A372678() {
    super(1, n -> Functions.PHI.z(n * 14).divide(6));
  }
}
