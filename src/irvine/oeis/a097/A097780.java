package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097780.
 * @author Sean A. Irvine
 */
public class A097780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097780() {
    super(new long[] {-1, 25}, new long[] {1, 25});
  }
}
