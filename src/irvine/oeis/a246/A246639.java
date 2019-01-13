package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246639.
 * @author Sean A. Irvine
 */
public class A246639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246639() {
    super(new long[] {1, -4, 4}, new long[] {8, 13, 28});
  }
}
