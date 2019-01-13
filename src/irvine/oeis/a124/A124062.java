package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124062.
 * @author Sean A. Irvine
 */
public class A124062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124062() {
    super(new long[] {-1, -1, -1, 1, 1, 1}, new long[] {1, 1, 2, 3, 5, 8});
  }
}
