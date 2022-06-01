package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199562 4*9^n+1.
 * @author Sean A. Irvine
 */
public class A199562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199562() {
    super(new long[] {-9, 10}, new long[] {5, 37});
  }
}
