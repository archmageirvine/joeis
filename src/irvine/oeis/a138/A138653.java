package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138653.
 * @author Sean A. Irvine
 */
public class A138653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138653() {
    super(new long[] {1, 1, -3, 3}, new long[] {1, 2, 4, 8});
  }
}
