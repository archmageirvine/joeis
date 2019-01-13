package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017573.
 * @author Sean A. Irvine
 */
public class A017573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017573() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1024, 1048576, 17210368, 102400000, 380204032, 1073741824});
  }
}
