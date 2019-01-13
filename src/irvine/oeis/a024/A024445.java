package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024445.
 * @author Sean A. Irvine
 */
public class A024445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024445() {
    super(new long[] {-840, 1114, -303, 30}, new long[] {1, 30, 597, 9934});
  }
}
