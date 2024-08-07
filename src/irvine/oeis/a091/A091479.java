package irvine.oeis.a091;
// Generated by gen_seq4.pl 2024-07-13/lambdan at 2024-07-13 23:12

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a000.A000522;

/**
 * A091479 Number of graphs with n nodes. Nodes and edges labeled each from their own label set.
 * @author Georg Fischer
 */
public class A091479 extends LambdaSequence {

  private static final DirectSequence A000522 = new A000522();

  /** Construct the sequence. */
  public A091479() {
    super(0, n -> A000522.a(Functions.TRIANGULAR.z(n - 1)));
  }
}
