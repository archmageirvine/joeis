package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054552.
 * @author Sean A. Irvine
 */
public class A054552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054552() {
    super(new long[] {1, -3, 3}, new long[] {1, 2, 11});
  }
}
