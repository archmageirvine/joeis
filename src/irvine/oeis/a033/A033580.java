package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033580.
 * @author Sean A. Irvine
 */
public class A033580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033580() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 28});
  }
}
