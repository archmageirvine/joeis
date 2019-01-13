package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219259.
 * @author Sean A. Irvine
 */
public class A219259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219259() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 23, 27, 96, 104});
  }
}
