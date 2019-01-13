package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259552.
 * @author Sean A. Irvine
 */
public class A259552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259552() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {41, 43, 53, 83, 151});
  }
}
