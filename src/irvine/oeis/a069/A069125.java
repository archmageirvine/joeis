package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069125.
 * @author Sean A. Irvine
 */
public class A069125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069125() {
    super(new long[] {1, -3, 3}, new long[] {1, 12, 34});
  }
}
