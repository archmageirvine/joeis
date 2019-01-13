package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083881.
 * @author Sean A. Irvine
 */
public class A083881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083881() {
    super(new long[] {-6, 6}, new long[] {1, 3});
  }
}
