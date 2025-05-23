package irvine.oeis.a135;
// Generated by gen_seq4.pl 2024-11-10.ack/lambdan at 2024-11-10 23:25

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A135708 Minimal total number of edges in a polyhex consisting of n hexagonal cells.
 * @author Georg Fischer
 */
public class A135708 extends LambdaSequence {

  /** Construct the sequence. */
  public A135708() {
    super(1, n -> Functions.CEIL_SQRT.z(12 * n - 3).add(3L * n));
  }
}
