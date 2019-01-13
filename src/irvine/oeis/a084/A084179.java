package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084179.
 * @author Sean A. Irvine
 */
public class A084179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084179() {
    super(new long[] {2, 3, -1}, new long[] {0, 1, -1});
  }
}
