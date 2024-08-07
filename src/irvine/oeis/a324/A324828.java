package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-07-15/lambdan at 2024-07-15 19:12

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A324828 a(n) = A324543(n) read modulo 2, where A324543 is the M\u00f6bius-transform of sigma(A156552(n)).
 * @author Georg Fischer
 */
public class A324828 extends LambdaSequence {

  private static final DirectSequence A324543 = new A324543();

  /** Construct the sequence. */
  public A324828() {
    super(1, n -> A324543.a(n).and(Z.ONE));
  }
}
