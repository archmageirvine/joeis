package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199020 4*11^n-1.
 * @author Sean A. Irvine
 */
public class A199020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199020() {
    super(new long[] {-11, 12}, new long[] {3, 43});
  }
}
