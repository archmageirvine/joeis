package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212656.
 * @author Sean A. Irvine
 */
public class A212656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212656() {
    super(new long[] {1, -3, 3}, new long[] {1, 6, 21});
  }
}
