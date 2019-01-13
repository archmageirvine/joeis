package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033562.
 * @author Sean A. Irvine
 */
public class A033562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033562() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 3, 17, 55});
  }
}
