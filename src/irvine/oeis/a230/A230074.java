package irvine.oeis.a230;

import irvine.oeis.LinearRecurrence;

/**
 * A230074.
 * @author Sean A. Irvine
 */
public class A230074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230074() {
    super(new long[] {-1, -1, -1}, new long[] {1, -2, 1});
  }
}
