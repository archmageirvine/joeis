package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142702 Period <code>4</code>: repeat <code>[5, 2, 5, 8]</code>.
 * @author Sean A. Irvine
 */
public class A142702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142702() {
    super(new long[] {1, -1, 1}, new long[] {5, 2, 5});
  }
}
