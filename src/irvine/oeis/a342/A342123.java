package irvine.oeis.a342;
// Generated by gen_seq4.pl 2024-07-13/lambdan at 2024-07-13 23:12

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a030.A030101;

/**
 * A342123 a(n) is the remainder when n is divided by its binary reverse.
 * @author Georg Fischer
 */
public class A342123 extends LambdaSequence {

  private static final DirectSequence A030101 = new A030101();

  /** Construct the sequence. */
  public A342123() {
    super(1, n -> Z.valueOf(n).mod(A030101.a(n)));
  }
}
