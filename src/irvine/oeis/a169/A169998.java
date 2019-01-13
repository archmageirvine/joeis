package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169998.
 * @author Sean A. Irvine
 */
public class A169998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169998() {
    super(new long[] {-2, -1}, new long[] {1, 1});
  }
}
