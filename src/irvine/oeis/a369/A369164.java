package irvine.oeis.a369;
// Generated by gen_seq4.pl dirtraf at 2024-02-05 19:10

import irvine.oeis.a000.A000688;
import irvine.oeis.a001.A001221;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A369164 a(n) = A001221(A000688(n)).
 * @author Georg Fischer
 */
public class A369164 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A369164() {
    super(1, new A001221(), new A000688());
  }
}
