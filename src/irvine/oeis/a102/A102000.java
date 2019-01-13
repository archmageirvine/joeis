package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102000.
 * @author Sean A. Irvine
 */
public class A102000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102000() {
    super(new long[] {8, 4, 2, 1}, new long[] {1, 2, 4, 8});
  }
}
