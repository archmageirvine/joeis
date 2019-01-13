package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132270.
 * @author Sean A. Irvine
 */
public class A132270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132270() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 1});
  }
}
