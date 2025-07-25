package irvine.oeis.a102;
// Generated by gen_seq4.pl 2025-07-08.ack/lambdan at 2025-07-08 21:48

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a000.A000081;
import irvine.oeis.memory.MemorySequence;

/**
 * A102911 Number of unlabeled (and unrooted) trees on 2n nodes with a bicentroid.
 * @author Georg Fischer
 */
public class A102911 extends LambdaSequence {

  private static final MemorySequence A000081 = new A000081();

  /** Construct the sequence. */
  public A102911() {
    super(0, n -> Functions.TRIANGULAR.z(A000081.a(n)));
  }
}
