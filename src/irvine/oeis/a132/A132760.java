package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132760.
 * @author Sean A. Irvine
 */
public class A132760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132760() {
    super(new long[] {1, -3, 3}, new long[] {0, 16, 34});
  }
}
