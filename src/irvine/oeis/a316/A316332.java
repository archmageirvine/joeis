package irvine.oeis.a316;
// Generated by gen_seq4.pl 2024-07-15/lambdan at 2024-07-15 19:12

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a000.A000085;

/**
 * A316332 a(n) = A000085(4*n+2)/2^(n+1).
 * @author Georg Fischer
 */
public class A316332 extends LambdaSequence {

  private static final DirectSequence A000085 = new A000085();

  /** Construct the sequence. */
  public A316332() {
    super(0, n -> A000085.a(4 * n + 2).divide(Z.TWO.pow(n + 1)));
  }
}
