package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125905.
 * @author Sean A. Irvine
 */
public class A125905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125905() {
    super(new long[] {-1, -4}, new long[] {1, -4});
  }
}
