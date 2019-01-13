package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098301.
 * @author Sean A. Irvine
 */
public class A098301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098301() {
    super(new long[] {1, -15, 15}, new long[] {0, 1, 16});
  }
}
