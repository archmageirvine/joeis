package irvine.oeis.a278;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A278123 a(n) = 247*2^n - 300.
 * @author Sean A. Irvine
 */
public class A278123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278123() {
    super(new long[] {-2, 3}, new long[] {194, 688});
  }
}
