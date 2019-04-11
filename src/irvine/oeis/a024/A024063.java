package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024063 <code>6^n-n</code>.
 * @author Sean A. Irvine
 */
public class A024063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024063() {
    super(new long[] {6, -13, 8}, new long[] {1, 5, 34});
  }
}
