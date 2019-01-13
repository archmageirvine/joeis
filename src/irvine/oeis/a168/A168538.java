package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168538.
 * @author Sean A. Irvine
 */
public class A168538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168538() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 24, 84, 204, 414});
  }
}
