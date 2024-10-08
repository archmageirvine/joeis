package irvine.oeis.a369;
// Generated by gen_seq4.pl 2024-09-22.ack/lambdan at 2024-09-22 22:36

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a010.A010051;
import irvine.oeis.a341.A341517;

/**
 * A369640 a(n) = 1 if n is composite and n' is a sum of distinct primorial numbers, otherwise 0, where n' stands for the arithmetic derivative of n, A003415.
 * @author Georg Fischer
 */
public class A369640 extends LambdaSequence {

  private static final DirectSequence A010051 = new A010051();
  private static final DirectSequence A341517 = new A341517();

  /** Construct the sequence. */
  public A369640() {
    super(0, n -> (n <= 1) ? Z.ZERO : (A341517.a(n)).abs().subtract(A010051.a(n)));
  }
}
