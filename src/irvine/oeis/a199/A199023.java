package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199023 (6*11^n - 1) / 5.
 * @author Sean A. Irvine
 */
public class A199023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199023() {
    super(new long[] {-11, 12}, new long[] {1, 13});
  }
}
