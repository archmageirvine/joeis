package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-09-22.ack/lambdan at 2024-09-22 22:36

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a001.A001511;

/**
 * A324882 a(1) = 0; for n &gt; 1, a(n) = A001511(A324866(n)), where A324866(n) = A156552(n) OR (A323243(n) - A156552(n)).
 * @author Georg Fischer
 */
public class A324882 extends LambdaSequence {

  private static final DirectSequence A001511 = new A001511();
  private static final DirectSequence A324866 = new A324866();

  /** Construct the sequence. */
  public A324882() {
    super(1, n -> (n <= 1) ? Z.ZERO : A001511.a(A324866.a(n)));
  }
}
