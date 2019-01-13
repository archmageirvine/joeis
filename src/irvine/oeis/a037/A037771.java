package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037771.
 * @author Sean A. Irvine
 */
public class A037771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037771() {
    super(new long[] {-10, 1, 0, 0, 10}, new long[] {3, 30, 302, 3021, 30213});
  }
}
