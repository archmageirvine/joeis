package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135492.
 * @author Sean A. Irvine
 */
public class A135492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135492() {
    super(new long[] {1, 1, 1, 1}, new long[] {2, 4, 8, 16});
  }
}
