package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177072.
 * @author Sean A. Irvine
 */
public class A177072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177072() {
    super(new long[] {1, -3, 3}, new long[] {14, 176, 500});
  }
}
