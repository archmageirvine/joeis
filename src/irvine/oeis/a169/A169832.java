package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169832.
 * @author Sean A. Irvine
 */
public class A169832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169832() {
    super(new long[] {-2, 7, -9, 5}, new long[] {0, 3, 26, 99});
  }
}
