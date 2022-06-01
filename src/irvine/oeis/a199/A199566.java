package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199566 (7*9^n+1)/2.
 * @author Sean A. Irvine
 */
public class A199566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199566() {
    super(new long[] {-9, 10}, new long[] {4, 32});
  }
}
