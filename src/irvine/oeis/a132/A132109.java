package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132109.
 * @author Sean A. Irvine
 */
public class A132109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132109() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 3, 7, 14});
  }
}
