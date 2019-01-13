package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240926.
 * @author Sean A. Irvine
 */
public class A240926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240926() {
    super(new long[] {1, -4, 4}, new long[] {4, 5, 9});
  }
}
