package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199553 5*8^n+1.
 * @author Sean A. Irvine
 */
public class A199553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199553() {
    super(new long[] {-8, 9}, new long[] {6, 41});
  }
}
