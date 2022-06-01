package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199019 3*11^n-1.
 * @author Sean A. Irvine
 */
public class A199019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199019() {
    super(new long[] {-11, 12}, new long[] {2, 32});
  }
}
