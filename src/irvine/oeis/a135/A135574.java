package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135574 <code>A024495</code> but with terms swapped in pairs.
 * @author Sean A. Irvine
 */
public class A135574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135574() {
    super(new long[] {4, 0, 3, 0, 3, 0}, new long[] {0, 0, 3, 1, 11, 6});
  }
}
