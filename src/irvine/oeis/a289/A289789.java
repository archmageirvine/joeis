package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289789.
 * @author Sean A. Irvine
 */
public class A289789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289789() {
    super(new long[] {5, 5, -5, 5}, new long[] {1, 6, 26, 111});
  }
}
