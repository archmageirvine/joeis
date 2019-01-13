package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219258.
 * @author Sean A. Irvine
 */
public class A219258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219258() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 25, 29, 104, 112});
  }
}
