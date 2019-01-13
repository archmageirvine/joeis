package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060626.
 * @author Sean A. Irvine
 */
public class A060626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060626() {
    super(new long[] {1, -3, 3}, new long[] {2, 14, 34});
  }
}
