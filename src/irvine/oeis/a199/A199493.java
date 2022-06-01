package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199493 2*8^n+1.
 * @author Sean A. Irvine
 */
public class A199493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199493() {
    super(new long[] {-8, 9}, new long[] {3, 17});
  }
}
