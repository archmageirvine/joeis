package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242728.
 * @author Sean A. Irvine
 */
public class A242728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242728() {
    super(new long[] {1, -4, 0, 4}, new long[] {1, 2, 7, 25});
  }
}
