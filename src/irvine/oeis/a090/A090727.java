package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090727.
 * @author Sean A. Irvine
 */
public class A090727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090727() {
    super(new long[] {-1, 16}, new long[] {2, 16});
  }
}
