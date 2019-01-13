package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080930.
 * @author Sean A. Irvine
 */
public class A080930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080930() {
    super(new long[] {-16, 32, -24, 8}, new long[] {1, 5, 20, 70});
  }
}
