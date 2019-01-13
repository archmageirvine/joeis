package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115067.
 * @author Sean A. Irvine
 */
public class A115067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115067() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 11});
  }
}
