package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158365 529n - 1.
 * @author Sean A. Irvine
 */
public class A158365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158365() {
    super(1, new long[] {-1, 2}, new long[] {528, 1057});
  }
}
