package irvine.oeis.a369;
// Generated by gen_seq4.pl dirtraf at 2024-02-03 12:35

import irvine.oeis.a000.A000188;
import irvine.oeis.a001.A001694;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A369429 Square root of the largest square dividing the n-th powerful number.
 * @author Georg Fischer
 */
public class A369429 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A369429() {
    super(1, new A000188(), new A001694());
  }
}
