package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132314.
 * @author Sean A. Irvine
 */
public class A132314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132314() {
    super(new long[] {-4, 0, 4, 0}, new long[] {0, 2, 4, 12});
  }
}
