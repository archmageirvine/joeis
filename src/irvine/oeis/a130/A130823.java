package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130823 Each odd number appears thrice.
 * @author Sean A. Irvine
 */
public class A130823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130823() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 1, 1, 3});
  }
}
