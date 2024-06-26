package irvine.oeis.a114;
// Generated by gen_seq4.pl 2024-05-08/multrad at 2024-05-08 21:31

import irvine.oeis.DirectSequence;
import irvine.oeis.a065.A065621;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A114390 a(n) = A065621(n^2).
 * @author Georg Fischer
 */
public class A114390 extends MultiTransformSequence {

  private static final DirectSequence SEQ = new A065621();

  /** Construct the sequence. */
  public A114390() {
    super(1, (self, n) -> SEQ.a(n * n), "1");
  }
}
