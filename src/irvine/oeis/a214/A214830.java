package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214830.
 * @author Sean A. Irvine
 */
public class A214830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214830() {
    super(new long[] {1, 1, 1}, new long[] {1, 8, 8});
  }
}
