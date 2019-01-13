package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037590.
 * @author Sean A. Irvine
 */
public class A037590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037590() {
    super(new long[] {-4, 1, 0, 4}, new long[] {1, 4, 19, 77});
  }
}
