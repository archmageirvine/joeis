package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084386.
 * @author Sean A. Irvine
 */
public class A084386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084386() {
    super(new long[] {3, 0, 1}, new long[] {1, 1, 1});
  }
}
