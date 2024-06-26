package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a323.A323243;

/**
 * A324729 a(n) = A000120(A323243(n)).
 * @author Georg Fischer
 */
public class A324729 extends LambdaSequence {

  private static final DirectSequence A323243 = new A323243();

  /** Construct the sequence. */
  public A324729() {
    super(1, n -> Functions.DIGIT_SUM.z(2, A323243.a(n)));
  }
}
