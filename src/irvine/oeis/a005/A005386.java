package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005386.
 * @author Sean A. Irvine
 */
public class A005386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005386() {
    super(new long[] {-1, 4, 4}, new long[] {1, 3, 16});
  }
}
