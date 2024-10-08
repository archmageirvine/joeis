package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-09-22.ack/lambdan at 2024-09-22 22:36

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a156.A156552;

/**
 * A324867 a(n) = A156552(n) XOR A324865(n), where XOR is bitwise-xor, A003987.
 * @author Georg Fischer
 */
public class A324867 extends LambdaSequence {

  private static final DirectSequence A156552 = new A156552();
  private static final DirectSequence A324865 = new A324865();

  /** Construct the sequence. */
  public A324867() {
    super(1, n -> (n <= 1) ? Z.ZERO : A156552.a(n).xor(A324865.a(n)));
  }
}
