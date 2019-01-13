package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033579.
 * @author Sean A. Irvine
 */
public class A033579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033579() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 20});
  }
}
