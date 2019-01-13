package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104095.
 * @author Sean A. Irvine
 */
public class A104095 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104095() {
    super(new long[] {1, 10, 19, 1}, new long[] {0, 1, 1, 2});
  }
}
