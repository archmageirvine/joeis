package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110679.
 * @author Sean A. Irvine
 */
public class A110679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110679() {
    super(new long[] {1, 5, 3}, new long[] {1, 2, 11});
  }
}
