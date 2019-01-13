package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241748.
 * @author Sean A. Irvine
 */
public class A241748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241748() {
    super(new long[] {1, -3, 3}, new long[] {12, 13, 16});
  }
}
