package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135628 Multiples of 28.
 * @author Sean A. Irvine
 */
public class A135628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135628() {
    super(new long[] {-1, 2}, new long[] {0, 28});
  }
}
