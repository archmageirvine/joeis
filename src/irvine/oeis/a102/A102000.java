package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102000 Sequence generated from a lattice packing matrix.
 * @author Sean A. Irvine
 */
public class A102000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102000() {
    super(new long[] {8, 4, 2, 1}, new long[] {1, 2, 4, 8});
  }
}
