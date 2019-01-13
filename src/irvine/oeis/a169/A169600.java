package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169600.
 * @author Sean A. Irvine
 */
public class A169600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169600() {
    super(new long[] {-1, 1, 1}, new long[] {4, 25, 35});
  }
}
