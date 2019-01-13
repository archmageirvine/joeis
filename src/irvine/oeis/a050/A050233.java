package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050233.
 * @author Sean A. Irvine
 */
public class A050233 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050233() {
    super(new long[] {-2, -1, -1, -1, -1, 3}, new long[] {0, 0, 0, 0, 1, 3});
  }
}
