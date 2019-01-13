package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037656.
 * @author Sean A. Irvine
 */
public class A037656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037656() {
    super(new long[] {-7, 1, 0, 7}, new long[] {3, 21, 149, 1046});
  }
}
