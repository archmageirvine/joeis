package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199563 5*9^n+1.
 * @author Sean A. Irvine
 */
public class A199563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199563() {
    super(new long[] {-9, 10}, new long[] {6, 46});
  }
}
