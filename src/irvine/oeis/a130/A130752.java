package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130752.
 * @author Sean A. Irvine
 */
public class A130752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130752() {
    super(new long[] {2, -3, 3}, new long[] {2, 5, 9});
  }
}
