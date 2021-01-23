package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138995 First differences of Frobenius numbers for 4 successive numbers A138984.
 * @author Sean A. Irvine
 */
public class A138995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138995() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 1, 6, 2, 2, 10});
  }
}
