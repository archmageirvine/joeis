package irvine.oeis.a352;
// Generated by gen_seq4.pl 2024-06-13/dirtraf at 2024-06-14 00:04

import irvine.oeis.a005.A005811;
import irvine.oeis.a109.A109812;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A352889 Number of runs in the binary expansion of A109812(n).
 * @author Georg Fischer
 */
public class A352889 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A352889() {
    super(1, new A005811(), new A109812());
  }
}
