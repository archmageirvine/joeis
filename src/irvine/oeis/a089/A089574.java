package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089574.
 * @author Sean A. Irvine
 */
public class A089574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089574() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {5, 32, 113, 299, 664, 1309});
  }
}
