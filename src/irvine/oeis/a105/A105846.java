package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105846.
 * @author Sean A. Irvine
 */
public class A105846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105846() {
    super(new long[] {1, -1, -4098, 4098, 1}, new long[] {0, 704, 1344, 2887040, 5509760});
  }
}
