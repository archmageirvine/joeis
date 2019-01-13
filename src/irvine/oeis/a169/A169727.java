package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169727.
 * @author Sean A. Irvine
 */
public class A169727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169727() {
    super(new long[] {8, -14, 7}, new long[] {1, 19, 127});
  }
}
