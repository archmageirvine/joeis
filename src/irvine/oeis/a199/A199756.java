package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199756 6*11^n+1.
 * @author Sean A. Irvine
 */
public class A199756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199756() {
    super(new long[] {-11, 12}, new long[] {7, 67});
  }
}
