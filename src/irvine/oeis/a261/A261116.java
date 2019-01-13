package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261116.
 * @author Sean A. Irvine
 */
public class A261116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261116() {
    super(new long[] {1, 0, -7, 0, 7, 0}, new long[] {0, 1, 3, 5, 20, 29});
  }
}
