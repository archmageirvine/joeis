package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125513.
 * @author Sean A. Irvine
 */
public class A125513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125513() {
    super(new long[] {-1, 0, 0, -1, 0, 2, 1, 0, 1, 1}, new long[] {2, 4, 8, 15, 26, 48, 89, 165, 305, 561});
  }
}
