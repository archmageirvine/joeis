package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098581.
 * @author Sean A. Irvine
 */
public class A098581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098581() {
    super(new long[] {8, 0, 0, 1}, new long[] {1, 3, 7, 7});
  }
}
