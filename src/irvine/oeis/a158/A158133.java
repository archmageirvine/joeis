package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158133 144n + 1.
 * @author Sean A. Irvine
 */
public class A158133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158133() {
    super(new long[] {-1, 2}, new long[] {145, 289});
  }
}
