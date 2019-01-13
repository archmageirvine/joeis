package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247620.
 * @author Sean A. Irvine
 */
public class A247620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247620() {
    super(new long[] {2, -5, 4}, new long[] {1, 7, 25});
  }
}
