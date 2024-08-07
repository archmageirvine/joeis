package irvine.oeis.a295;
// Generated by gen_seq4.pl 2024-07-24.ack/lambdan at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a005.A005940;

/**
 * A295896 a(n) = 1 if there are no odd runs of 1's in the binary expansion of n followed by a 0 to their right, 0 otherwise.
 * @author Georg Fischer
 */
public class A295896 extends LambdaSequence {

  private static final DirectSequence A005940 = new A005940();

  /** Construct the sequence. */
  public A295896() {
    super(0, n -> Functions.PARITY.z(Functions.SIGMA1.z(A005940.a(n + 1))));
  }
}
