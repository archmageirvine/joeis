package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212755.
 * @author Sean A. Irvine
 */
public class A212755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212755() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 10, 37, 96, 205});
  }
}
