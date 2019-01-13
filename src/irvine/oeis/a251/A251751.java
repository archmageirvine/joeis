package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251751.
 * @author Sean A. Irvine
 */
public class A251751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251751() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 1, 0, 0, 0, 0, 0, 0});
  }
}
